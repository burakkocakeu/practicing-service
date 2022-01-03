package com.burakkocak.practicingservice.quick.autowire;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class TestingInterfaceToListService implements CommandLineRunner {

    public final List<TestingInterfaceToList> testingInterfaceToList;

    @Override
    public void run(String... args) throws Exception {
        log.info("TestingInterfaceToList: " + testingInterfaceToList.size());
        testingInterfaceToList.stream().forEach(t -> log.info(t.sayHello()));

        log.info("LocalDateTime: {}", LocalDateTime.now());
        log.info("OffsetDateTime: {}", OffsetDateTime.now());

        log.info("Logs ToStringTesting: {}", ToStringTesting.builder().build());
        String id = "18589790120";
        log.info("Id masked: {}",  "*******" + id.substring(7, 11));
        log.info("Id masked length is: {} - is equal to 11, {}",  id.length(), id.length() == 11);
    }
}
