package com.burakkocak.practicingservice.quick.autowire.impl;

import com.burakkocak.practicingservice.quick.autowire.TestingInterfaceToList;
import org.springframework.stereotype.Component;

@Component
public class FirstTestingInterfaceToListImpl implements TestingInterfaceToList {
    @Override
    public String sayHello() {
        return "First Impl says Hello to you!";
    }
}
