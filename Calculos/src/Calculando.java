
public class Calculando implements ICalculos{

	@Override
	public int somarDoisNumeros(String nUm, String nDois) {
		//Arrumar
		int um = Integer.parseInt(nUm);
		int dois = Integer.parseInt(nDois);
		
		//Agir
		int resultado = (um + dois);
		
		//Afirmar
		return resultado;
	}

	@Override
	public int subtrairDoisNumeros(String nUm, String nDois) {
		//Arrumar
		int um = Integer.parseInt(nUm);
		int dois = Integer.parseInt(nDois);
		
		//Agir
		int resultado = (um - dois);
		
		//Afirmar
		return resultado;
	}

	@Override
	public double dividirDoisNumeros(String nUm, String nDois) {
		//Arrumar
		double um = Double.parseDouble(nUm);
		double dois = Double.parseDouble(nDois);
		
		//Agir
		double resultado = (um / dois);
		
		//Afirmar
		return resultado;
	}

	@Override
	public double raizQuadrada(String numero) {
		//Arrumar
		double valor = Double.parseDouble(numero);
		if (numero == "") {
			throw new RuntimeException("Não é possivel fazer a raiz quadrada com valor em branco");
		}
		//Agir
		double result = Math.pow(valor, 0.5);
		double rairQuadrada = result;
		
		//Afirmar
		return rairQuadrada;
	}

}
