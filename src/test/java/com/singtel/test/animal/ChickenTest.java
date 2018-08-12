package com.singtel.test.animal;

import com.singtel.test.enums.Gender;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static com.singtel.test.animal.Chicken.DEFAULT_SOUND;
import static com.singtel.test.animal.Chicken.MALE_SOUND;

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

    @Test
    public void makeSound_Male() throws IOException {
        duck = new Chicken(Gender.MALE);
        duck.makeSound();
        assertValue(MALE_SOUND);
    }
}