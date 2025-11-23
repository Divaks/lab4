package chef;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ChefApplicationTest {

    @Test
    void testApplicationConstructs() {
        ChefApplication app = new ChefApplication();
        assertNotNull(app);
    }
}