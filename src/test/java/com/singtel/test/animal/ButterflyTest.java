package com.singtel.test.animal;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static com.singtel.test.constant.Constants.DEFAULT_FLYING;
import static com.singtel.test.constant.Constants.DEFAULT_WALKING;

public class ButterflyTest extends AbstractAnimalTest {
    private Butterfly butterfly;

    @Before
    public void init() {
        byteArrayOutputStream = mockSysout();
        butterfly = new Butterfly();
    }

    @Test
    public void makeSound() throws IOException {
        butterfly.makeSound();
        assertValue("");
    }

    @Test
    public void fly_butterfly() throws IOException {
        butterfly.metamorphosis();
        butterfly.fly();
        assertValue(DEFAULT_FLYING);
    }

    @Test
    public void walk_butterfly() throws IOException {
        butterfly.metamorphosis();
        butterfly.walk();
        assertValue("");
    }

    @Test
    public void fly_caterpillar() throws IOException {
        butterfly.fly();
        assertValue("");
    }

    @Test
    public void walk_caterpillar() throws IOException {
        butterfly.walk();
        assertValue(DEFAULT_WALKING);
    }
}