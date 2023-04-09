package anagram;

import java.util.Arrays;

public class AnagramSorted {

    public static void main(String[] args) {

        String givenWord = "sukumars";
        String checkAnagramWord = "sramukus";

        System.out.println("Are anagrams ?: " + isAnagram(givenWord, checkAnagramWord));

    }

    public static boolean isAnagram(String givenWord, String checkAnagramWord) {

        String sortedGivenWord = sortByCharArrayMethod(givenWord);
        String sortedCheckAnagramWord = sortByCharArrayMethod(checkAnagramWord);

        return sortedGivenWord.equals(sortedCheckAnagramWord);
    }

    public static String sortByCharArrayMethod(String someString) {

        char[] someStringToCharArray = someString.toLowerCase().toCharArray();

        System.out.print("[28] someString.toLowerCase().toCharArray() : ");
        for (Character element: someStringToCharArray) {
            System.out.print(element);
        }

        Arrays.sort(someStringToCharArray);
        System.out.println("\n[29] String.valueOf(someStringToCharArray) : " + String.valueOf(someStringToCharArray));
        return String.copyValueOf(someStringToCharArray);
    }
}
