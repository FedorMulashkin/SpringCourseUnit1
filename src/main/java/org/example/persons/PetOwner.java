package org.example.persons;

import org.example.pets.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PetOwner implements Person {
    @Value("Yury Gagarin")
    private String name;
    private final Pet pet;

    public PetOwner(@Qualifier("dog") Pet pet) {
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet getPet() {
        return pet;
    }

    /*public void setPet(Pet pet) {
        this.pet = pet;
    }*/

    @Override
    public void hello() {
        System.out.println("Hi! My name is " + name);
    }

    @Override
    public void callPet() {
        System.out.println("It's my pet " + pet.getName());
        pet.say();
    }
}
