package crackingcodeinterviewquestions.Chapter1;

import java.util.Arrays; // Add this line to import the Arrays class
import java.util.List;
import java.util.stream.Collectors;

import com.google.common.collect.Comparators;

public class Chapter1Main {
    public Chapter1Main() {
        // 1.1:
        String[] words = { "asdf", "asdasd", "aavda", "bafsdewtryhjrjt" };

        for (var word : words) {
            // System.out.println("1.1: isStringUnique " + word + ": " +
            // isStringUnique(word));
        }

        // 1.3: We will assume case and space sensitive:
        System.out.println("1.3: isAnagramOfAnother: " + isAnagramOfOtherMethod1("god", "dog")); // true
        System.out.println("1.3: isAnagramOfAnother: " + isAnagramOfOtherMethod1("God", "dog")); // false

        

    }

    // 1.1 - Implement an algorithm to determine if a string has all unique
    // characters. What if you cannot use additional data structures?
    boolean isStringUnique(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) {
                return false;

            }
            checker |= (1 << val);
        }
        return true;
    }

    // 1.3
    boolean isAnagramOfOtherMethod1(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        var temp1 = sort(str1);
        var temp2 = sort(str2);
        return sort(str1).equals(sort(str2));
    }

    String sort(String str) {
        List<Character> charList = str.chars()
                .mapToObj(c -> (char) c)
                .toList();
        return charList.stream().sorted().collect(Collectors.toList()).toString();       
    }

}