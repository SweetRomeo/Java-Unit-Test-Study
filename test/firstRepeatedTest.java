package com.telusko.string.operation.test;

import com.telusko.string.operation.StringUtil;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class firstRepeatedTest {

    @Test
    public void shouldReturnFirstWhenThereIsRepeated()
    {
        String testText1 = "kaya";
        String testText2 = "kaaaiii";

        assertEquals(StringUtil.firstRepeated(testText1), 'a');
        assertEquals(StringUtil.firstRepeated(testText2), 'a');
    }

    @Test
    public void shouldReturnWhiteSpaceWhenThereIsNonRepeated()
    {
        String testText1 = "wolf";
        String testText2 = "a";

        assertEquals(StringUtil.firstRepeated(testText1), ' ');
        assertEquals(StringUtil.firstRepeated(testText2), ' ');
    }
}
