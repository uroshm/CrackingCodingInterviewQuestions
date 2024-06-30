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
}
