package anagram;

public class Anagram {

    public static void main(String[] args) {

        String givenWord = "sukumars";
        String checkAnagramWord = "sramukus";

        System.out.println("given are anagrams :" + isAnagram(givenWord, checkAnagramWord));

    }

    public static boolean isAnagram(String givenWord, String checkAnagramWord) {
        System.out.println("[15] givenWord.length() : " + givenWord.length() + " ---> checkAnagramWord.length(): " + checkAnagramWord.length());
        if (givenWord.length() != checkAnagramWord.length()){
            return false;
        }

        for (int i = 0; i < givenWord.length(); i++) { // its looping on givenWord, not on checkAnagramWord because checkAnagramWord will be destroyed character by character
            char charInWordAtIndex_i = givenWord.charAt(i);
            int indexOfCharInAnagramForCharInWord = checkAnagramWord.indexOf(charInWordAtIndex_i);
            System.out.println("[23] checkAnagramWord: "+checkAnagramWord+" ---> i: "+i+" ---> charInWordAtIndex_i: givenWord.charAt(i): "+givenWord.charAt(i)+" ---> indexOfCharInAnagramForCharInWord: checkAnagramWord.indexOf(charInWordAtIndex_i): "+checkAnagramWord.indexOf(charInWordAtIndex_i));


            if (indexOfCharInAnagramForCharInWord != -1) {
                System.out.println("[27] indexOfCharInAnagramForCharInWord: checkAnagramWord.indexOf(charInWordAtIndex_i): "+checkAnagramWord.indexOf(charInWordAtIndex_i)+" ---> checkAnagramWord.substring(0, indexOfCharInAnagramForCharInWord): "+checkAnagramWord.substring(0, indexOfCharInAnagramForCharInWord)+" ---> checkAnagramWord.substring(indexOfCharInAnagramForCharInWord + 1, checkAnagramWord.length()): "+checkAnagramWord.substring(indexOfCharInAnagramForCharInWord + 1, checkAnagramWord.length()));
                checkAnagramWord = checkAnagramWord.substring(0, indexOfCharInAnagramForCharInWord) + checkAnagramWord.substring(indexOfCharInAnagramForCharInWord + 1, checkAnagramWord.length());
                System.out.println("[29] givenWord.length() : " + givenWord.length() + " ---> checkAnagramWord.length(): " + checkAnagramWord.length());

            } else {
                System.out.println("[32] Return False");
                return false;
            }
        }
        System.out.println("[36] return checkAnagramWord.isEmpty(): " + checkAnagramWord.isEmpty());
        return checkAnagramWord.isEmpty();
    }

}
