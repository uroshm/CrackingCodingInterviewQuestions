package crackingcodeinterviewquestions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import crackingcodeinterviewquestions.Chapter1.Chapter1;

class Chapter1Test {

    static Chapter1 chapter1;

    @BeforeAll
    static void setupAll() {
        chapter1 = new Chapter1();
    }

    @Test
    void replaceSpaces() {
        assertEquals("Mr%20John%20Smith",
            chapter1.replaceSpaces("Mr John Smith     ".toCharArray(), 13));
    }

    @Test
    void replaceSpaces2() {
        assertEquals("Mr%20tJohn%20Smith%20HI%20HI",
            chapter1.replaceSpaces("Mr John Smith HI HI     ".toCharArray(), 27));
    }
}
