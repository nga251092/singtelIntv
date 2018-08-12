package com.singtel.test.animal;

import com.singtel.test.enums.Size;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static com.singtel.test.constant.Constants.DEFAULT_MAKE_JOKES;
import static org.junit.Assert.assertEquals;

public class ClownFishTest extends AbstractAnimalTest {
    private ClownFish clownFish;

    @Before
    public void init() {
        byteArrayOutputStream = mockSysout();
        clownFish = new ClownFish();
    }

    @Test
    public void makeJokes() throws IOException {
        clownFish.makeJokes();
        assertEquals(Size.SMALL, clownFish.getSize());
        assertEquals(ClownFish.DEFAULT_COLOR, clownFish.getColor());
        assertValue(DEFAULT_MAKE_JOKES);
    }
}