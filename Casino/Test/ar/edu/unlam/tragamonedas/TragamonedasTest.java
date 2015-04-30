package ar.edu.unlam.tragamonedas;

import org.junit.Assert;
import org.junit.Test;

public class TragamonedasTest {
	
	
	@Test
	public void PerderEnElCasino(){
		
		Tragamonedas traga1 = new Tragamonedas();
		traga1.CaraAleatoria();
		traga1.MostrarCaras();
		Assert.assertTrue(traga1.GirarPalanca() == false);
		
	}

}
