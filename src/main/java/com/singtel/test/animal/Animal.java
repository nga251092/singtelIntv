package com.singtel.test.animal;

import static com.singtel.test.constant.Constants.DEFAULT_WALKING;

public abstract class Animal {
    protected String sound;

    public void walk() {
        System.out.println(DEFAULT_WALKING);
    }

    public void makeSound() {
        System.out.println(sound);
    }
}