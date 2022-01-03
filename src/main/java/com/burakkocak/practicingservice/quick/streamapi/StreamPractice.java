package com.burakkocak.practicingservice.quick.streamapi;

import com.burakkocak.practicingservice.samplingentities.data.entity.User;
import com.burakkocak.practicingservice.samplingentities.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class StreamPractice implements CommandLineRunner {

    private final UserService userService;

    public void streams() throws JsonProcessingException {
        List<String> nameList = Arrays.asList("Kemal", "Hasan", "Murat", "Cansu", "Elif");
        log.info("Data:");
        log.info("Name list: {}", nameList);

        log.info("Users list: {}", new ObjectMapper().writeValueAsString(userService.findAll()));

        List<User> userList = userService.findAll().getContent();
        log.info("User 'Burak' has found: {}",
                userList.stream().filter(user -> user.getName().equalsIgnoreCase("burak")).findFirst().orElse(null));

        userList.stream()
                .filter(user -> user.getName().equals("Burak") || user.getName().equals("Kaan"))
                .map(u -> u.getId())
                .forEach(System.out::println);

        log.info("Enum equals string: " + (TestingEnums.METROPOL.equals("METROPOL") ? "TRUE" : "FALSE"));
        log.info("Enum name equals string: " + (TestingEnums.METROPOL.name().equals("METROPOL") ? "TRUE" : "FALSE"));
    }

    @Override
    public void run(String... args) throws Exception {
        streams();
    }

    public enum TestingEnums {
        METROPOL, QR_CODE
    }
}
