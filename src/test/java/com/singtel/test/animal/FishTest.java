package com.singtel.test.animal;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static com.singtel.test.constant.Constants.DEFAULT_SWIMMING;

public class FishTest extends AbstractAnimalTest {
    private Fish fish;

    @Before
    public void init() {
        byteArrayOutputStream = mockSysout();
        fish = new Fish();
    }

    @Test
    public void swim() throws IOException {
        fish.swim();
        assertValue(DEFAULT_SWIMMING);
    }
}