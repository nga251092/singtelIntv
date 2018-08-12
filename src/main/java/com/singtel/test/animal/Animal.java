package com.singtel.test.animal;

import com.singtel.test.enums.Gender;

public abstract class Animal {
    protected String sound;
    protected Gender gender = Gender.UNKNOWN;

    public void makeSound() {
        System.out.println(sound);
    }
}