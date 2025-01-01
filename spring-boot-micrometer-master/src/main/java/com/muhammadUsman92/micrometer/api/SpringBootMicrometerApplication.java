package com.muhammadUsman92.micrometer.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@RestController
@Slf4j // Lombok annotation to create a logger instance automatically
public class SpringBootMicrometerApplication {

    @GetMapping("/message")
    public String getMessage() {
        log.info("Processing /message endpoint request");
        return "Working...!!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMicrometerApplication.class, args);
        log.info("Spring Boot Micrometer application started successfully!");
    }
}
