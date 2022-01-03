package com.burakkocak.practicingservice.mapper;

import com.burakkocak.practicingservice.mapper.spring.UserSpringMapper;
import com.burakkocak.practicingservice.samplingentities.data.entity.User;
import com.burakkocak.practicingservice.samplingentities.service.dto.UserResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Slf4j
@Component
@RequiredArgsConstructor
public class MapperRunner implements CommandLineRunner {

    public final UserSpringMapper mapper;

    @Override
    public void run(String... args) throws Exception {
        log.info("AOP mapper has started to log.");
        User user = new User();
        user.setId(UUID.randomUUID());
        user.setName("Mapper");

        UserResponse userApi = mapper.map(user);

        User user2 = new User();
        user2.setId(UUID.randomUUID());
        user2.setName("Second");

        List userList = new ArrayList();
        userList.add(user);
        userList.add(user2);

        mapper.map(userList);

        Thread.sleep(2000);

        User user3 = new User();
        user3.setId(UUID.randomUUID());
        user3.setName("Second");

        userList.add(user3);

        log.info("AOP mid....");

        mapper.map(userList);

        log.info("AOP mapper has logged the type conversation, successfully. UserApi: {}.", userApi);
    }

}
