package suma;

public class ASumar {


	public ASumar() {
		
	}
	public String mostrar(String cad) {
        String numero = cad;
        if (numero.length() == 1) {
            return (numero + " = " + numero);
        }
		return numero; 

	}
}
