import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * Created by mainframe on 29.05.2017.
 */
public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void solution() throws Exception {

        assertEquals(1, solution.solution(4, 4));
        assertEquals(2, solution.solution(4, 9));
        assertEquals(3, solution.solution(4, 17));
        assertEquals(4, solution.solution(4, 27));
        assertEquals(5, solution.solution(4, 40));
        assertEquals(6, solution.solution(4, 50));

    }

    @Test
    public void main() throws Exception {
        assertTrue(true);
    }
}

