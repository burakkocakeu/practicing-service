package com.burakkocak.practicingservice.samplingentities.service;

import com.burakkocak.practicingservice.samplingentities.data.entity.User;
import org.springframework.data.domain.Page;

public interface UserService {

    Page<User> findAll();

    User save(User user);

}
