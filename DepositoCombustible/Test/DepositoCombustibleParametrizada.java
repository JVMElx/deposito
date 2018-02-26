import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class DepositoCombustibleParametrizada {
	private double nivelinicial;
	private double nivelmaximo;
	private double ctdConsumo;
	private double ctdLlenado;
	private double resultado;

	
	
	
	public DepositoCombustibleParametrizada(double nivel, double capacidad, double consumo,
			double llenado, double result) {
		
		nivelinicial = nivel;
		nivelmaximo = capacidad;
		ctdConsumo = consumo;
		ctdLlenado = llenado;
		resultado = result;
	}

	@Parameters
	public static Collection<Object[]> numeros(){
	return Arrays.asList (new Object[][]{
	{20,120,20,0,0}  //inicial 20 , capacidad 120, consumo 20, lleno 0, resultado quedan 0
	,{120,120,20,0,100}
	,{0,60,0,50,50}
	,{100,100,80,0,20}
	});
	}
	@Test
	public void testParemetrosConsumir() {
	DepositoCombustible sc = new DepositoCombustible(nivelinicial,nivelmaximo);
	sc.consumir(ctdConsumo);
	assertEquals(resultado,sc.getDepositoNivel(),0);
	}
	

}
