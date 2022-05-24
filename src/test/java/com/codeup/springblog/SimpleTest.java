package com.codeup.springblog;

import com.codeup.springblog.services.StringService;
import org.junit.Before;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.*;

public class SimpleTest {
    private StringService stringService;

    @Before
    public void setUp(){
        this.stringService = new StringService();
    }

    @Test
    public void testServiceNotNull(){
        assertNotNull(stringService);
    }

    @Test
    public void testGetWordsInCaps(){
        String word = "Hello";
        String upperCaseWord = stringService.getWordInCaps(word);
        assertEquals(upperCaseWord, word.toUpperCase());
    }

    @Test
    public void testLimitLength() {

        // should return the full string without the dots if string
        // length is less than the limit
        String words = "Hello I am a longer piece of text.";
        String limitedWords = stringService.limitLength(words, 5);

        // test case
        assertEquals(limitedWords, "Hello...");

        String longLimit = stringService.limitLength(words, 100);

        assertEquals(longLimit, words);

        // should return ... if the string is over the limit
    }

}
