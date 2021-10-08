package com.ist012m.evee.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/control/")
public class SystemController {
    @GetMapping("/checkConnection")
    public HttpStatus checkConnection() {
        return HttpStatus.OK;
    }
}
