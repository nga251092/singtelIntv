package com.singtel.test.animal;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static com.singtel.test.animal.TestHelper.assertValue;
import static com.singtel.test.constant.Constants.*;

public class BirdTest {
    private ByteArrayOutputStream byteArrayOutputStream;
    private Bird bird;

    @Before
    public void init() {
        byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));
        bird = new Bird();
    }

    @Test
    public void sing() throws IOException {
        bird.sing();
        assertValue(byteArrayOutputStream, DEFAULT_SINGING);
    }

    @Test
    public void walk() throws IOException {
        bird.walk();
        assertValue(byteArrayOutputStream, DEFAULT_WALKING);
    }

    @Test
    public void fly() throws IOException {
        bird.fly();
        assertValue(byteArrayOutputStream, DEFAULT_FLYING);
    }
}