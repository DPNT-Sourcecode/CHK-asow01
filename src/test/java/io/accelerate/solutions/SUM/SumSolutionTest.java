package io.accelerate.solutions.SUM;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SumSolutionTest {
    private SumSolution sum;

    @BeforeEach
    public void setUp() {
        sum = new SumSolution();
    }

    @Test
    public void compute_sum() {
        assertThat(sum.compute(1, 1), equalTo(2));
        assertThat(sum.compute(0, 100), equalTo(100));
        assertThat(sum.compute(23, 46), equalTo(69));
        assertThrows(ArithmeticException.class, () -> sum.compute(123, 980));
    }
}
