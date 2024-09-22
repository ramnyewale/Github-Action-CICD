package com.dev;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CICDController {

    @GetMapping("/health")
    public String health() {
        return "Application is healthy.";
    }
}
