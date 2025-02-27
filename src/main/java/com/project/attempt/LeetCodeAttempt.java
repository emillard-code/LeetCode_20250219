package com.project.attempt;

import java.util.Collections;
import java.util.LinkedList;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        System.out.println(theKthLexicographicalStringOfAllHappyStringsOfLengthN(1,3));
        System.out.println(theKthLexicographicalStringOfAllHappyStringsOfLengthN(1,4));
        System.out.println(theKthLexicographicalStringOfAllHappyStringsOfLengthN(3,9));

    }

    // This method returns the k-th entry of all happy strings sorted by lexicographical order.
    public static String theKthLexicographicalStringOfAllHappyStringsOfLengthN(int n, int k) {

        // We contain our list of happy strings in LinkedList happyStrings.
        LinkedList<String> happyStrings = new LinkedList<>();

        // We call a helper method to fill it in with all valid happy strings, then we sort them.
        happyStrings = happyStrings(n, happyStrings, "");
        Collections.sort(happyStrings);

        // If int k is larger than the actual size of LinkedList happyStrings,
        // then we return an empty string as per challenge specifications.
        if (happyStrings.size() < k) { return ""; }

        // Finally, we return the happy string at index k-1.
        // (As we want the k-th string and the LinkedList is 0-indexed, we go for the k-1 index)
        return happyStrings.get(k-1);

    }

    // A helper method that helps to add valid happy strings to the LinkedList happyStrings.
    // We use recursion to gradually add characters to string happyString to get all valid happy strings.
    private static LinkedList<String> happyStrings(int n, LinkedList<String> happyStrings, String happyString) {

        // If string happyString has equaled the length of int n, add it to the LinkedList and return.
        // We make sure not to add any duplicate values by checking if it's already added or not.
        if (happyString.length() == n) {
            if (!happyStrings.contains(happyString)) { happyStrings.add(happyString); }
            return happyStrings;
        }

        // Otherwise, we add either 'a', 'b', or 'c' to the end of string happyString
        // and perform a recursive call that would continue to do the same thing until
        // string happyString eventually reaches the length of int n. We make sure that
        // the string is either empty or that the previous character is not the same as
        // the character we're trying to add when we do this, to follow challenge constraints.
        if (happyString.isEmpty() || happyString.charAt(happyString.length() - 1) != 'a') {
            happyStrings(n, happyStrings, happyString + 'a');
        }

        if (happyString.isEmpty() || happyString.charAt(happyString.length() - 1) != 'b') {
            happyStrings(n, happyStrings, happyString + 'b');
        }

        if (happyString.isEmpty() || happyString.charAt(happyString.length() - 1) != 'c') {
            happyStrings(n, happyStrings, happyString + 'c');
        }

        // Finally, we return the LinkedList when we're done.
        return happyStrings;

    }

}
