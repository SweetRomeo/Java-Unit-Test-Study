package com.telusko.string.operation.test;

import com.telusko.string.operation.StringUtil;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class isPangramTest {
    @Test
    public void ShouldReturnTrueWhenTextIsPangram()
    {
        String testCase1 = "The quick brown fox jumps over a lazy dog";
        String testCase2 = "THE QUICK BROWN FOX JUMPS OVER A LAZY DOG";

        assertTrue(StringUtil.isPangram(testCase1));
        assertTrue(StringUtil.isPangram(testCase2));
    }
}