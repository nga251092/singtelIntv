package com.singtel.test.interfaces;

import static com.singtel.test.constant.Constants.DEFAULT_FLYING;

public interface FlyingAnimal {

    default void fly() {
        System.out.println(DEFAULT_FLYING);
    }
}
