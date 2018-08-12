package com.singtel.test.interfaces;

import static com.singtel.test.constant.Constants.DEFAULT_SWIMMING;

public interface SwimmingAnimal {
    default void swim() {
        System.out.println(DEFAULT_SWIMMING);
    }
}
