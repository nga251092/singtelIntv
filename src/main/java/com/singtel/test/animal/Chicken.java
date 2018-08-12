package com.singtel.test.animal;

import com.singtel.test.enums.Gender;

public class Chicken extends Bird {
    //make default modifier for testing
    static final String DEFAULT_SOUND = "Cluck, cluck";
    //make default modifier for testing
    static final String MALE_SOUND = "Cock-a-doodle-doo";

    public Chicken() {
        this(Gender.UNKNOWN);
    }

    public Chicken(Gender gender) {
        super.gender = gender;
        if (Gender.MALE.equals(gender)) {
            super.sound = MALE_SOUND;
        } else {
            super.sound = DEFAULT_SOUND;
        }
    }

    public void fly() {
    }
}
