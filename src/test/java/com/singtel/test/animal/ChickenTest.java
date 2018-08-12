package com.singtel.test.animal;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static com.singtel.test.animal.Chicken.DEFAULT_SOUND;

public class ChickenTest extends AbstractAnimalTest {

    private Chicken duck;

    @Before
    public void init() {
        byteArrayOutputStream = mockSysout();
        duck = new Chicken();
    }

    @Test
    public void makeSound() throws IOException {
        duck.makeSound();
        assertValue(DEFAULT_SOUND);
    }

    @Test
    public void fly() throws IOException {
        duck.fly();
        assertValue("");
    }
}