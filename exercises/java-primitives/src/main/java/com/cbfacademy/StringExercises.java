package com.cbfacademy;

public class StringExercises {

    public String fromCharacters(char[] characters) {
        // TODO - Write code that creates a String from the input array of characters
        String str = "";

        for (char character:characters) {
            str += character;
        }
        return str;
//        throw new RuntimeException("Not implemented");
    }

    public Long howMany(String text, Character character) {
        // TODO - Write code to determine how many of the input ${character} are contained in the input ${text}
        Long count = 0L;
        for (int i = 0; i < text.length(); i++) {
            if(character==text.charAt(i)){
                count++;
            }
        }
        return count;
//        throw new RuntimeException("Not implemented");
    }

    public Boolean isPalindrome(String word) {
        // TODO - Write code to determine whether the input ${word} is a palindrome
        throw new RuntimeException("Not implemented");
    }

    public String getName() {
        return "String Exercises";
    }
}
