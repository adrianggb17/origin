import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Act3_3 {

	static SumaNum2 tester;
	
	@BeforeAll
	static void testBefore() {
		tester = new SumaNum2();
	}
	
	@Test
    void arrayVacio () {
        int [] array = {};

        assertEquals (tester.Suma(array),0, "Sumar num acabados en 2");
    }
	@Test
    void sumarn2() {
        int [] array = {2,22,15};

        assertEquals (tester.Suma(array),24, "Sumar num acabados en 2");
    }
	@Test
    void sumarnegativos() {
        int [] array = {2,-22,-15};

        assertEquals (tester.Suma(array),2, "Sumar num acabados en 2");
    }
	@Test
    void sumarno2() {
        int [] array = {1,13,14};

        assertEquals (tester.Suma(array),0, "Sumar num acabados en 2");
    }
	
	
	
	
	@Test
    void arrayVacio1 () {
        int [] array = {};

        assertEquals (tester.contPares(array),0, "Contar pares");
    }
	@Test
    void arrayNumPares () {
        int [] array = {4,13,20};

        assertEquals (tester.contPares(array),0, "Contar pares");
    }
	@Test
    void arrayNumimpares () {
        int [] array = {3,13,21};

        assertEquals (tester.contPares(array),0, "Contar pares");
    }
	@Test
    void arrayNegaPares () {
        int [] array = {-4,-12,-20};

        assertEquals (tester.contPares(array),0, "Contar pares");
    }
	@Test
    void arrayNegaimPares () {
        int [] array = {-3,-13,-19};

        assertEquals (tester.contPares(array),0, "Contar pares");
    }
    
}
	

