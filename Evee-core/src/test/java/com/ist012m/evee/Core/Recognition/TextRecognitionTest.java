package com.ist012m.evee.Core.Recognition;

import static org.junit.jupiter.api.Assertions.*;

import java.io.*;

import com.ist012m.evee.Pojo.Passport;
import com.mysql.cj.result.Field;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TextRecognitionTest {
    @Test
    public void getFromImgTest() {
        TextRecognition textRecognition = new TextRecognition();
        File img = new File("src/test/java/com/ist012m/evee/resources/testPassport2.png");
        Passport passport = textRecognition.getFromImage(img);
        Assertions.assertNotNull(passport.getSeries());
        Assertions.assertNotNull(passport.getNumber());
    }
}