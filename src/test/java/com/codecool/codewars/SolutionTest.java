package com.codecool.codewars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {


        @Test
        public void testEnoughSpace() {
            assertEquals("Should return 0.", 0, EnoughSpace.enough(10, 5, 5));
            assertEquals("Should return 10.", 10, EnoughSpace.enough(100, 60, 50));
            assertEquals("Should return 0.", 0, EnoughSpace.enough(20, 5, 5));
        }
    }

