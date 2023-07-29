package conversorMulti;

public class ConversorDeMasa {
	
	public double convertirMasa(double valor,String masaOrigen, String masaFinal) {
		
		// de (mg) a las otras medidas.
		if (masaOrigen.equals("Gramo(g)") && masaFinal.equals("Kilogramo(Kg)")) {
			return valor / 1000;
		}else if (masaOrigen.equals("Kilogramo(Kg)") && masaFinal.equals("Gramo(g)")) {
	        return valor * 1000;
	    }else {
	    
			return valor; // No se realiza ninguna conversión si las monedas son las mismas
		}
		
		}

}
