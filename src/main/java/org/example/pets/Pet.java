package org.example.pets;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public interface Pet {
    void say();

    String getName();

    @PostConstruct
    default void postConstruct() {
        System.out.println("Pet Initialized");
    }

    @PreDestroy
    default void preDestroy() {
        System.out.println("Pet Destroyed");
    }

}
