package com.singtel.test.animal;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class ParrotTest extends AbstractAnimalTest {

    @Before
    public void init() {
        byteArrayOutputStream = mockSysout();
    }

    @Test
    public void makeSound_nearDog() throws IOException {
        String sound = "Woof, woof";
        new Parrot(sound).makeSound();
        assertValue(sound);
    }

    @Test
    public void makeSound_nearCat() throws IOException {
        String sound = "Meow";
        new Parrot(sound).makeSound();
        assertValue(sound);
    }

    @Test
    public void makeSound_nearRooster() throws IOException {
        String sound = "Cock-a-doodle-doo";
        new Parrot(sound).makeSound();
        assertValue(sound);
    }
}