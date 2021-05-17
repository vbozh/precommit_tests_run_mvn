import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RunTestClass_AfterFailed {

    @Test
    public void failsOnAfter() {
        assertTrue(true);
    }

    @AfterEach
    public void after() {
        assertFalse(true, "boom!");
    }
}
