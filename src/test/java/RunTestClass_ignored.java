import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RunTestClass_ignored {

    @Disabled
    @Test
    public void ignored() {
        assertTrue(true);
        assertTrue(false);
    }
}
