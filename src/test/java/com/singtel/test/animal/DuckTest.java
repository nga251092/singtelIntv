package com.singtel.test.animal;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static com.singtel.test.constant.Constants.DEFAULT_SWIMMING;

public class DuckTest extends AbstractAnimalTest {
    private Duck duck;

    @Before
    public void init() {
        byteArrayOutputStream = mockSysout();
        duck = new Duck();
    }

    @Test
    public void makeSound() throws IOException {
        duck.makeSound();
        assertValue(Duck.DEFAULT_SOUND);
    }

    @Test
    public void swim() throws IOException {
        duck.swim();
        assertValue(DEFAULT_SWIMMING);
    }
}