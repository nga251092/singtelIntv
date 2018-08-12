package com.singtel.test.interfaces;

import static com.singtel.test.constant.Constants.DEFAULT_SINGING;

public interface SingingAnimal {

    default void sing() {
        System.out.println(DEFAULT_SINGING);
    }
}
