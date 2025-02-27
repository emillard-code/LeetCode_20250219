package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void getHappyStringTest() {

        assertEquals("c", LeetCodeSolution.getHappyString(1,3));
        assertEquals("", LeetCodeSolution.getHappyString(1,4));
        assertEquals("cab", LeetCodeSolution.getHappyString(3,9));

    }


}
