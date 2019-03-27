package PacotePalindromo;

public class Palindromo implements IPalindromo {

	@Override
	public boolean isPalindromo(String palindromo) {
		String stringInvertida = new StringBuffer(palindromo).reverse().toString();
		
		if( (palindromo == "") || (palindromo.equals(null)) )
			throw new NumberFormatException("Texto vazio. É preciso digitar algum texto!");
		else 
			if(stringInvertida.equals(palindromo) || (stringInvertida.trim() == palindromo)) 
				return true;
			else
				return false;
			}
	}


