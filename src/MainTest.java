import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testPermutation() {
        assertEquals(Main.permutation(10, 8), BigInteger.valueOf(1814400));
    }
}
