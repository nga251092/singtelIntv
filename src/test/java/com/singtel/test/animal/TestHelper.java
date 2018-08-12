package com.singtel.test.animal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class TestHelper {
    public static final String NEW_LINE = "\r\n";

    public static void assertValue(ByteArrayOutputStream byteArrayOutputStream, String expected) throws IOException {
        byteArrayOutputStream.flush();
        String allWrittenLines = new String(byteArrayOutputStream.toByteArray());
        assertEquals("".equals(expected) ? expected : expected + NEW_LINE, allWrittenLines);
    }
}
