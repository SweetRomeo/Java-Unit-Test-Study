package com.telusko.string.operation;

import java.util.HashMap;
import java.util.Map;

public class StringUtil {
    public static char firstRepeated(String s)
    {
        for (int i = 0; i < s.length() - 1; ++i)
        {
            for (int k = i + 1; k < s.length(); ++k)
            {
                if (s.charAt(i) == s.charAt(k))
                {
                    return s.charAt(i);
                }
            }
        }
        return ' ';
    }

    public static String ReverseString(String s)
    {
        String reversed = "";

        for (int i = s.length() - 1; 0 <= i; --i)
        {
            reversed += s.charAt(i);
        }
        return reversed;
    }

    public static String ReverseWords(String s)
    {
        var words = s.split(" ");

        StringBuilder result = new StringBuilder();

        for (var i = words.length - 1; 0 <= i; --i)
        {
            result.append(words[i]);
            if (i != 0)
            {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static char MostRepeated(String s)
    {
        Map<Character, Integer> chars = new HashMap<>();

        for (int i = s.length() - 1; 0 <= i; --i)
        {
            if (!chars.containsKey(s.charAt(i)))
            {
                chars.put(s.charAt(i), 1);
            }
            else
            {
                int count = chars.get(s.charAt(i));
                chars.replace(s.charAt(i), ++count);
            }
        }
        int repeatedMax = 0;
        char repeatedMaxChar = 0;
        for (int i = 0; i < s.length(); ++i)
        {
            if (repeatedMax < chars.get(s.charAt(i)))
            {
                repeatedMax = chars.get(s.charAt(i));
                repeatedMaxChar = s.charAt(i);
            }
        }
        if (repeatedMax == 1)
        {
            return ' ';
        }
        return repeatedMaxChar;
    }

    public static boolean isPangram(String text)
    {
        String alphabet = "abcdefghijklmnqrstuvwxyz";
        for (int i = 0; i < alphabet.length(); ++i)
        {
            if (text.indexOf(Character.toLowerCase(alphabet.charAt(i))) == -1)
            {
                return false;
            }
        }
        return true;
    }
}
