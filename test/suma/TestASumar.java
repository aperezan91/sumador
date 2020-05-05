package suma;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestASumar {

	@Test
    public void testUnaCifra() {
        ASumar sumi = new ASumar();
        String resultado = sumi.mostrar("5");
        assertEquals("5 = 5",resultado );
    }
	
	@Test
    public void testUnaCifraNeg() {
        ASumar sumi = new ASumar();
        String resultado = sumi.mostrarNeg("-5");
        assertEquals("",resultado );
    }

}
