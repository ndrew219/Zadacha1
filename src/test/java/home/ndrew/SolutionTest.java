package home.ndrew;


import org.junit.Test;
import static home.ndrew.Solution.ILLEGAL_INPUT_ERROR_CODE;
import static home.ndrew.Solution.LEFT_BOUNDARY;
import static home.ndrew.Solution.RIGHT_BOUNDARY;
import static home.ndrew.Solution.ILLEGAL_RANGE_ERROR_CODE;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


/**
 * Created by mainframe on 29.05.2017.
 */
public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testPositiveFrom1To101() throws Exception {

        assertEquals(1, solution.solution(4, 4));
        assertEquals(2, solution.solution(4, 9));
        assertEquals(3, solution.solution(4, 17));
        assertEquals(4, solution.solution(4, 27));
        assertEquals(5, solution.solution(4, 40));
        assertEquals(6, solution.solution(4, 50));
        assertEquals(7, solution.solution(1, 50));
        assertEquals(8, solution.solution(1, 67));
        assertEquals(8, solution.solution(1, 80));
        assertEquals(9, solution.solution(1, 81));
        assertEquals(10, solution.solution(1, 101));
    }

    // разбиваем диапазон входных значений на две группы -
    // меньше нуля, и больше или равно нулю и пишем тест для каждой группы
    @Test
    public void testNegativeFromLeftBoundaryToMinusOne() {
        for (int i = LEFT_BOUNDARY; i < 0; i++) {
            int expectedVal = 0;
            int actualVal = solution.solution(i, -1);
            assertEquals(expectedVal, actualVal);
        }
    }

    @Test
    public void testPositiveFromZeroToRightBoundary() {
        for (int i = 0; i <= RIGHT_BOUNDARY; i++) {
            int expectedVal = (int) (1 + Math.sqrt(i));
            int actualVal = solution.solution(0, i);
            assertEquals(expectedVal, actualVal);
        }
    }

    @Test
    public void testPositiveBoundaries() {


        assertEquals(101, solution.solution(0, 10000));
        assertEquals(100, solution.solution(1, 10000));
        assertEquals(99, solution.solution(1, 9999));
        assertEquals(1, solution.solution(10000, 10000));
        assertEquals(1, solution.solution(0, 0));
        assertEquals(1, solution.solution(1, 1));
        assertTrue(solution.solution(0,0)==1);
    }

    @Test
    public void testNegativeBoundaries() {


        assertEquals(1, solution.solution(-10000, 0));
        assertEquals(0, solution.solution(-10000, -1));
        assertEquals(0, solution.solution(-10000, -10000));
        assertEquals(1, solution.solution(-1, 0));
        assertEquals(2, solution.solution(-1, 1));
    }

    // тестируем возможные ошибочные ситуации

    @Test
    public void testErrorAGreaterThanB() {
        assertEquals(ILLEGAL_INPUT_ERROR_CODE, solution.solution(10000, 0));
        assertEquals(ILLEGAL_INPUT_ERROR_CODE, solution.solution(1, 0));
    }

    @Test
    public void testErrorIllegalRange() {
        assertEquals(ILLEGAL_RANGE_ERROR_CODE, solution.solution(-99999, 0));
        assertEquals(ILLEGAL_RANGE_ERROR_CODE, solution.solution(0, 10001));
        assertEquals(ILLEGAL_RANGE_ERROR_CODE, solution.solution(10001, 10002));
    }
}

