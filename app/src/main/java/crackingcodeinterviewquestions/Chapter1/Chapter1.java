package crackingcodeinterviewquestions.Chapter1;

import java.util.List;
import java.util.stream.Collectors;

public class Chapter1 {
    public Chapter1() { /* TODO document why this constructor is empty */ }

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

    public String replaceSpaces(char[] str, int length) {
        
        // remember to check for trailing or leading space since that isn't "part of" somehow...
        
        var numSpaces = 0;
        for(int i = 0; i < length; i++) {
            if(str[i]==' ') {
                numSpaces++;
            }
        }

        var newLength = length + numSpaces * 2;
        for(int i = length - 1; i >= 0; i-- ) {
            if(str[i]==' ') {
                str[newLength -1] = '0';
                str[newLength -2] = '2';
                str[newLength -3] = '%';
                newLength -= 3;
            } else {
                str[newLength - 1] = str[i];
                newLength -= 1;
            }
        }
        return String.valueOf(str).substring(0,str.length-1);
    }

    
}