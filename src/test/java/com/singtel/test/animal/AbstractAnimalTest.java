package com.singtel.test.animal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class AbstractAnimalTest {
    private static final String NEW_LINE = "\r\n";
    ByteArrayOutputStream byteArrayOutputStream;

    protected void assertValue(String expected) throws IOException {
        byteArrayOutputStream.flush();
        String allWrittenLines = new String(byteArrayOutputStream.toByteArray());
        assertEquals("".equals(expected) ? expected : expected + NEW_LINE, allWrittenLines);
    }

    protected ByteArrayOutputStream mockSysout() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));
        return byteArrayOutputStream;
    }
}
