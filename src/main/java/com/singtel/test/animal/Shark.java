package com.singtel.test.animal;

import com.singtel.test.enums.Size;

public class Shark extends Fish {
    static final Size DEFAULT_SIZE = Size.LARGE;
    static final String DEFAULT_COLOR = "Grey";

    public Shark() {
        this.size = DEFAULT_SIZE;
        this.color = DEFAULT_COLOR;
    }

    public void eat(Fish fish) {
        System.out.println("Eating fish: " + fish.getClass());
    }
}
