package me.zach.demo.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumImplmentationTest {
    @Test
    public void when_inputA_and_inputB_Are_Added_then_ResultShouldBe_Sum_of_A_and_B() {
        SumService sumService = new SumService();
        int a = 1;
        int b = 1;
        int expectedResult = 2;
        int actualResult = sumService.sum(a, b);

        assertEquals(expectedResult, actualResult);
    }
}
