package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void jumpTest() {
        Solution solution = new Solution();
        assertEquals(2, solution.jump(new int[]{2,3,1,1,4}));
        assertEquals(2, solution.jump(new int[]{2,3,0,1,4}));
    }

}