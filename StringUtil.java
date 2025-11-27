package com.telusko.string.operation;

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
        
    }
}
