package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void theKthLexicographicalStringOfAllHappyStringsOfLengthNTest() {

        assertEquals("c", LeetCodeAttempt.theKthLexicographicalStringOfAllHappyStringsOfLengthN(1,3));
        assertEquals("", LeetCodeAttempt.theKthLexicographicalStringOfAllHappyStringsOfLengthN(1,4));
        assertEquals("cab", LeetCodeAttempt.theKthLexicographicalStringOfAllHappyStringsOfLengthN(3,9));

    }

}
