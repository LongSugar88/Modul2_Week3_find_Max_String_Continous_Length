import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class FindMaxTest {

    @Test
    void find() {
        String myString = "abcabcdgabxy";
        String expect = "abcdg";
        String result = FindMax.find(myString);
        assertEquals(expect, result);
    }
    @Test
    void find1() {
        String myString = "abcabcdgabmnsxy";
        String expect = "abmnsxy";
        String result = FindMax.find(myString);
        assertEquals(expect, result);
    }
}