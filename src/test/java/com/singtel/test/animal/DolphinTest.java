package com.singtel.test.animal;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static com.singtel.test.constant.Constants.DEFAULT_SWIMMING;

public class DolphinTest extends AbstractAnimalTest {
    private Dolphin dolphin;

    @Before
    public void init() {
        byteArrayOutputStream = mockSysout();
        dolphin = new Dolphin();
    }

    @Test
    public void swim() throws IOException {
        dolphin.swim();
        assertValue(DEFAULT_SWIMMING);
    }
}