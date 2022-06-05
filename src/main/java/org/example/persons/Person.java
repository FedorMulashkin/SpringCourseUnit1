package org.example.persons;

import javax.annotation.PostConstruct;

public interface Person {
    void hello();
    void callPet();
    @PostConstruct
    default void init(){

    }
}
