import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RunTestClass_BeforeFailed {

    @BeforeEach
    public void before() {
        assertTrue(false, "fails!");
    }

    @Test
    public void failsOnBefore() {
        assertTrue(false);
    }
}
