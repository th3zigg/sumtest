package me.zach.demo.sum;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class SumImplmentationTest {
    @Mock
    private DataService dataService;

    @Test
    public void when_inputA_and_inputB_Are_Added_then_ResultShouldBe_Sum_of_A_and_B() {
        when(dataService.getSavedNumbers()).thenReturn(2);
        SumService sumService = new SumService(dataService);
        int a = 1;
        int b = 1;
        int expectedResult = 2;
        int actualResult = sumService.sum(a, b);

        assertEquals(expectedResult, actualResult);
    }
}
