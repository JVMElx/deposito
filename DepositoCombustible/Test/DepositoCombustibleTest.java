import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DepositoCombustibleTest {

		DepositoCombustible depComb;

	@Before
	public void testDepositoCombustibleJVM() {
		depComb = new DepositoCombustible(120,20);
	}
	
	
	@After
	public void finPruebasJVM(){
		depComb=null;
	}
	
	
	
	@Test
	public void testGetDepositoNivelJVM() {
		assertEquals(20,depComb.getDepositoNivel(),0);
	}

	@Test
	public void testGetDepositoMaxJVM() {
		assertEquals(120,depComb.getDepositoMax(),0);
	}

	@Test
	public void testEstaVacioJVM() {
		assertFalse(depComb.estaVacio());
	}

	@Test
	public void testEstaLlenoJVM() {
		assertFalse(depComb.estaLleno());
	}

	@Test
	public void testFillJVM() {
		assertEquals(60,(depComb.getDepositoMax()/2),0);
	}

	@Test
	public void testConsumirJVM() {
		assertEquals(20,depComb.getDepositoNivel(),0);
	}

}
