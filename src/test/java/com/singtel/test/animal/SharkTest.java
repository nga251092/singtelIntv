package com.singtel.test.animal;

import com.singtel.test.enums.Size;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class SharkTest extends AbstractAnimalTest {
    private Shark shark;

    @Before
    public void init() {
        byteArrayOutputStream = mockSysout();
        shark = new Shark();
    }

    @Test
    public void eat() throws IOException {
        shark.eat(new ClownFish());
        assertEquals(Size.LARGE, shark.getSize());
        assertEquals(Shark.DEFAULT_COLOR, shark.getColor());
        assertValue("Eating fish: class com.singtel.test.animal.ClownFish");
    }
}