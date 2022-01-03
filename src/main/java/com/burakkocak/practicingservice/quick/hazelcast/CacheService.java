package com.burakkocak.practicingservice.quick.hazelcast;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CacheService {

    @Cacheable("name")
    public String getName() {
        return getWithDelay("Hazelcast");
    }

    @Cacheable("version")
    public String getVersion() {
        return getWithNoDelay("v1.0");
    }

    public String getWithDelay(String name) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return name;
    }

    public String getWithNoDelay(String version) {
        return version;
    }

}
