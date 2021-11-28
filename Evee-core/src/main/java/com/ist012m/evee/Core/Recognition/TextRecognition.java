package com.ist012m.evee.Core.Recognition;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

import com.ist012m.evee.Pojo.Passport;
import com.nimbusds.oauth2.sdk.util.StringUtils;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class TextRecognition {
    private static final String NUMBER_AND_SERIES_STRING_REGEX = "^[0-9]{2}.[0-9]{2}.[0-9]{5,7}";
    private static final String SERIES_STRING_REGEX = "^[0-9]{2}.[0-9]{2}";
    private static final String NUMBER_STRING_REGEX = ".[0-9]{5,7}";
    private static final String TESSERACT_PATH = "src/main/resources/tessdata";
    private static final String LANG = "eng";

    public Passport getFromImage(File img) {
        Passport passport = new Passport();
        try {
            Tesseract tesseract = new Tesseract();
            tesseract.setDatapath(TESSERACT_PATH);
            tesseract.setLanguage(LANG);
            tesseract.setPageSegMode(1);
            tesseract.setOcrEngineMode(1);
            List<String> result = Arrays.stream(tesseract.doOCR(img).split("\n")).collect(Collectors.toList());
            String numberString = result.stream().filter(input -> input.matches(NUMBER_AND_SERIES_STRING_REGEX)).findFirst().orElse("");
            if (StringUtils.isNotBlank(numberString)) {
                Long number = Long.valueOf(numberString.replaceAll(NUMBER_STRING_REGEX, "").replaceAll(" ", ""));
                passport.setNumber(number);
                Long series = Long.valueOf(numberString.replaceAll(SERIES_STRING_REGEX, "").replaceAll(" ", ""));
                passport.setSeries(series);
            }
        } catch (TesseractException e) {
            throw new RuntimeException(e);
        }
        return passport;
    }
}
