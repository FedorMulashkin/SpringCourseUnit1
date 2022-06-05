package org.example.pets;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Pet {
    private String name;

    public Cat() {
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("Meow meow");
    }
}
