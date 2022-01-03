package com.burakkocak.practicingservice.quick.autowire.impl;

import com.burakkocak.practicingservice.quick.autowire.TestingInterfaceToList;
import org.springframework.stereotype.Component;

@Component
public class ThirdTestingInterfaceToListImpl implements TestingInterfaceToList {
    @Override
    public String sayHello() {
        return "Third Impl says Hello to you!";
    }
}
