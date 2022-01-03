package com.burakkocak.practicingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class PracticingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticingServiceApplication.class, args);
    }

}
