package com.singtel.test.animal;

import com.singtel.test.enums.Gender;
import com.singtel.test.enums.Size;

public abstract class Animal {
    protected String sound;
    protected Gender gender = Gender.UNKNOWN;
    protected Size size;
    protected String color;

    public void makeSound() {
        System.out.println(sound);
    }

    public String getSound() {
        return sound;
    }

    public Gender getGender() {
        return gender;
    }

    public Size getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
}