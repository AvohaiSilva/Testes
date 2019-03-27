package Teste;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import PacotePalindromo.Palindromo;

public class TestePalindromo {
	private boolean valorEsperado;
	private Palindromo palindromo;
	
	@Before
	public void criaObjeto() {
		this.palindromo = new Palindromo();
	}
	//Teste com exception
	@Test(expected=NumberFormatException.class)
	public void palindromoTesteComNull() {
	
		// Arrumar
		String texto = "";
		
		//Agir
		valorEsperado = palindromo.isPalindromo(texto);
		
		//Afirmar
		assertFalse(valorEsperado);
	}
	
	//Teste com resultado true
	@Test
	public void palindromoTesteComValorTrue() {
		
		//Arumar
		String texto = "ana";
		
		//Agir
		valorEsperado = palindromo.isPalindromo(texto);
		
		//Agir
		assertTrue(valorEsperado);
	}
	
	//Teste com resultado false
	@Test
	public void testePalindromoComValorFalse() {
		
		//Arrumar
		String texto = "tartaruga";
		
		//Agir
		valorEsperado = palindromo.isPalindromo(texto);
		
		//Afirmar
		assertFalse(valorEsperado);
	}
	
	//Teste com  numero e resultado true
	public void palindromoComNumeroTrue() {
		
		//Arrumar
		String texto = "22322";
		
		//Agir
		valorEsperado = palindromo.isPalindromo(texto);
		
		//Afirmar
		assertTrue(valorEsperado);	
	}
	
	//Teste com  numero e resultado False
	public void palindromoComNumeroFalse() {
		
		//Arrumar
		String texto = "22312";
		
		//Agir
		valorEsperado = palindromo.isPalindromo(texto);
		
		//Afirmar
		assertFalse(valorEsperado);
	
	}
	
	
	
	
}
