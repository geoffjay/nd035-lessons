package com.nd035.lesson1;

public class OnlyVowels {

    public static void main(String[] args) {
        System.out.println(vowelOnly("wahdahtah"));
        System.out.println(vowelOnly("pootietang"));
        System.out.println(vowelOnly("AshyLarry"));
    }

    public static String vowelOnly(String input) {
        String vowels = "aeiou";
        StringBuilder output = new StringBuilder ();
        for (int i = 0; i < input.length(); i++) {
            if (vowels.contains(String.valueOf(input.charAt(i)).toLowerCase())) {
                output.append(String.valueOf(input.charAt(i)));
            }
        }
        return output.toString();
    }
}
