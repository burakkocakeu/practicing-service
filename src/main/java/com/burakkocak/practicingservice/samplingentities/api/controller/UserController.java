package com.burakkocak.practicingservice.samplingentities.api.controller;

import com.burakkocak.practicingservice.samplingentities.data.entity.User;
import com.burakkocak.practicingservice.samplingentities.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<Page<User>> getUserList() {
        Page<User> userPage = userService.findAll();
        return ResponseEntity.ok(userPage);
    }

    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.save(user));
    }

    @GetMapping("secure")
    @PreAuthorize("hasRole('ADMINISTRATION')")
    public ResponseEntity<Page<User>> getUserListSecured() {
        return ResponseEntity.ok(userService.findAll());
    }

}
