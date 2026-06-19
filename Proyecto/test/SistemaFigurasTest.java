import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SistemaFigurasTest {
    @Test
    public void testCircuitoCalculoAreaTotal() {
        // Arrange: Integración de múltiples clases relacionadas
        Figura[] figuras = new Figura[2];
        figuras[0] = new Circulo("Moneda", 2.50); // Área esperada: ~19.63
        figuras[1] = new Rectangulo("Cuadro", 8.40, 6.20); // Área esperada: 52.08
        
        // Act: Circuito de sumarización
        double areaTotal = 0;
        for(Figura f : figuras) {
            areaTotal += f.calcularArea();
        }
        
        // Assert: 19.6349... + 52.08 = 71.7149...
        assertEquals(71.71, areaTotal, 0.1);
    }
}