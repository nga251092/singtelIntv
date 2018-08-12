package com.singtel.test.animal;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static com.singtel.test.constant.Constants.*;

public class BirdTest extends AbstractAnimalTest {
    private Bird bird;

    @Before
    public void init() {
        byteArrayOutputStream = mockSysout();
        bird = new Bird();
    }

    @Test
    public void sing() throws IOException {
        bird.sing();
        assertValue(DEFAULT_SINGING);
    }

    @Test
    public void walk() throws IOException {
        bird.walk();
        assertValue(DEFAULT_WALKING);
    }

    @Test
    public void fly() throws IOException {
        bird.fly();
        assertValue(DEFAULT_FLYING);
    }
}