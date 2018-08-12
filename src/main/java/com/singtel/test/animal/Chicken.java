package com.singtel.test.animal;

public class Chicken extends Bird {
    static final String DEFAULT_SOUND = "Cluck, cluck";

    public Chicken() {
        super.sound = DEFAULT_SOUND;
    }

    public void fly() {
    }
}
