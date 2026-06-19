import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RectanguloTest {
    @Test
    public void testCalcularArea() {
        Rectangulo rect = new Rectangulo("Test", 8.40, 6.20);
        assertEquals(52.08, rect.calcularArea(), 0.01);
    }
}