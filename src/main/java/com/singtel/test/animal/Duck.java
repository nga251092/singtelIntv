package com.singtel.test.animal;

import com.singtel.test.interfaces.SwimmingAnimal;

public class Duck extends Bird implements SwimmingAnimal {
    static final String DEFAULT_SOUND = "Quack, quack";

    public Duck() {
        super.sound = DEFAULT_SOUND;
    }
}
