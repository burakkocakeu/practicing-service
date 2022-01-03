package com.burakkocak.practicingservice.quick.autowire.impl;

import com.burakkocak.practicingservice.quick.autowire.TestingInterfaceToList;
import org.springframework.stereotype.Component;

@Component
public class SecondTestingInterfaceToListImpl implements TestingInterfaceToList {
    @Override
    public String sayHello() {
        return "Second Impl says Hello to you!";
    }
}
