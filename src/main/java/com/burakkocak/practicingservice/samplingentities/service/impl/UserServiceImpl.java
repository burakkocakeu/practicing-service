package com.burakkocak.practicingservice.samplingentities.service.impl;

import com.burakkocak.practicingservice.samplingentities.data.entity.User;
import com.burakkocak.practicingservice.samplingentities.data.repository.UserRepository;
import com.burakkocak.practicingservice.samplingentities.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public Page<User> findAll() {
        return userRepository.findAll(PageRequest.of(0, 100));
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

}
