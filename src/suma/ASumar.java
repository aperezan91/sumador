package suma;

public class ASumar {


	public ASumar() {
		
	}
	
	/**
	 * Este metodo comprueba si el numero introducido es de un digito 
	 * y devuelve una cadena
	 * @author Adrian Perez
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
}
