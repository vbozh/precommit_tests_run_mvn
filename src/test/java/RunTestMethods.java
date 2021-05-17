import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodDescriptor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RunTestMethods {

    @Test
    public void failed() {
        assertEquals(5, Math.pow(2,2));
    }

    @Test
    public void passed() {
        assertEquals(4, Math.pow(2,2));
    }

    @Disabled
    @Test
    public void ignored() {
        assertEquals(5, Math.pow(2,2));
    }
}

