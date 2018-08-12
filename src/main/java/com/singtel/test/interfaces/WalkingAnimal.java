package com.singtel.test.interfaces;

import static com.singtel.test.constant.Constants.DEFAULT_WALKING;

public interface WalkingAnimal {
    default void walk() {
        System.out.println(DEFAULT_WALKING);
    }
}
