package com.burakkocak.practicingservice.quick;

import com.burakkocak.practicingservice.samplingentities.service.dto.UserResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TestingLoggingStrings implements CommandLineRunner {
    @Override
    public void run(String... args) {
        String nullValue = null;

        try {
            log.info("Error logging has started!");
            nullValue.toString();
            log.info("Error logging has failed!");
        } catch (Exception ex) {
            log.error("Error log is: .", ex);
            log.error("Error log is: {}.", ex);

            String stackTrace = ExceptionUtils.getStackTrace(ex);
            log.error("Error log stacktrace is: .", stackTrace);
            log.error("Error log stacktrace is: {}.", stackTrace);
        } finally {
            UserResponse response = UserResponse.builder()
                    .name("Josh")
                    .build();

            log.info("Name is: .", response);
            log.info("Name is: {}.", response);
            log.info("Name is: {}.", response.toString());
        }
    }
}
