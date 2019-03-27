import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Teste {
	
	@Test
	public void testarSoma() {
		// Arrumar
		Calculando calculando = new Calculando();
		
		// Agir
		int resultadoTeste = calculando.somarDoisNumeros("6", "-4");
		
		// Afirmar
		Assert.assertEquals(2, resultadoTeste);
		
	}
	
	@Test
	public void testarSubtracao() {
		//Arrumar
		Calculando calculo = new Calculando();
		
		//Agir
		int resultadoTeste = calculo.subtrairDoisNumeros("9", "3");
		
		//Afirmar
		Assert.assertEquals(6, resultadoTeste);
	}
	@Test
	public void testarDivisão() {
		//Arrumar
		Calculando calc = new Calculando();
		
		//Agir
		double resultado = calc.dividirDoisNumeros("10", "2");
		
		//Afirmar
		Assert.assertEquals(5, resultado, 0);
	}
	
	@Test
	public void testeRaisQuadrada() {
		//Arrumar
		Calculando calc = new Calculando();
		
		//Agir
		double resultado = calc.raizQuadrada("81");
		
		//Afirmar
		Assert.assertEquals(9, resultado, 0);
		
	}
}
