package suma;

public class ASumar {

	/**
	 * @author Adrian Perez
	 */

	public ASumar() {
		
	}
	
	/**
	 * Este metodo comprueba si el numero introducido es de un digito 
	 * y devuelve una cadena
	 * @param cad
	 * @return numero
	 */
	 
	public String mostrar(String cad) {
        String numero = cad;
        if (numero.length() == 1) {
            return (numero + " = " + numero);
        }
		return numero; 

	}
	
	/**
	 * Este metodo comprueba si el numero introducido es negativo 
	 * y devuelve una cadena vacia
	 * @param cad
	 * @return numero
	 */
	public String mostrarNeg(String cad) {
        String numero = cad;
        if (Integer.parseInt(numero) < 0) {
            return ("");
        }
		return numero; 

	}
	
	/**
	 * Este metodo realiza la suma de los digitos de un string
	 * @param cad
	 * @return suma
	 */
	public int total(String valor_inicial) {
        int suma = 0;
        int b = 1;
		for (int i = 0; i < valor_inicial.length(); i++) {
            // Cadena de un dígito.
            String digito = valor_inicial.substring(i, b);
            b++;
            suma = suma + Integer.parseInt(digito);
        }
        return suma;

    }
}
