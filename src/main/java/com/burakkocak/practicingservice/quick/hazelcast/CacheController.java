package com.burakkocak.practicingservice.quick.hazelcast;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class CacheController implements CommandLineRunner {

    private final CacheService cacheService;

    @GetMapping("hazelcast")
    public String getName() {
        log.info("Getting name...");
        String name = cacheService.getName();
        log.info("Name has been retrieved with success!!!");
        return name;
    }

    @GetMapping("hazelcast/version")
    public String getVersion() {
        log.info("Getting version...");
        String version = cacheService.getVersion();
        log.info("Version has been retrieved with success!!!");
        return version;
    }


    @Override
    public void run(String... args) {
        //log.info("Name #1 is " + getName());

        try { Thread.sleep(1000); } catch (Exception e) {}

        //log.info("Name #2 is " + getName());
    }
}
