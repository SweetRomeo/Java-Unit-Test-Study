package com.telusko.string.operation.test;

import com.telusko.string.operation.StringUtil;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ReverseWordsTest {
    @Test
    public void shouldReturnSameTextWhenThereIsOnlyOneWord()
    {
        String testText1 = "wolf";
        String testText2 = "Hello";

        assertEquals(StringUtil.ReverseWords(testText1), testText1);
        assertEquals(StringUtil.ReverseWords(testText2), testText2);
    }
    @Test
    public void shouldReturnReversedWhenThereIsMoreThanOneWord()
    {
        String testText1 = "Hello World";
        String testText2 = "Leonardo Da Vinci";

        assertEquals(StringUtil.ReverseWords(testText1), "World Hello");
        assertEquals(StringUtil.ReverseWords(testText2), "Vinci Da Leonardo");
    }
}
