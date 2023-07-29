package conversorMulti;

public class ConversorDeTemperatura {
	
	
	public double convertirTemperatura(double valor,String temperaturaOrigen, String temperaturaFinal) {
	
	// de (C) a las otras temperaturas.
	if (temperaturaOrigen.equals("Celsius(C)") && temperaturaFinal.equals("Fahrenheit(F)")) {
		return valor * 1.8 + 32;
	}else if (temperaturaOrigen.equals("Celsius(C)") && temperaturaFinal.equals("Kelvin(K)")) {
        return valor + 273.15;
    }else if (temperaturaOrigen.equals("Celsius(C)") && temperaturaFinal.equals("Reaumur(R)")) {
        return valor * 0.8;
    }else if (temperaturaOrigen.equals("Celsius(C)") && temperaturaFinal.equals("Rankine")) {
        return valor * 9/5 + 491.67;
    }
	// de otras temperaturas a (C).	
    else if (temperaturaOrigen.equals("Fahrenheit(F)") && temperaturaFinal.equals("Celsius(C)")) {
        return (valor -32)/1.8 ;
    } else if (temperaturaOrigen.equals("Kelvin(K)") && temperaturaFinal.equals("Celsius(C)")) {
        return valor - 273.15;
    }else if (temperaturaOrigen.equals("Reaumur(R)") && temperaturaFinal.equals("Celsius(C)")) {
        return valor / 0.80000;
    } else if (temperaturaOrigen.equals("Rankine") && temperaturaFinal.equals("Celsius(C)")) {
        return ( valor - 491.67) * 5/9;
    }
	//de (F) a las otras temperaturas.
    else if (temperaturaOrigen.equals("Fahrenheit(F)") && temperaturaFinal.equals("Kelvin(K)")) {
        return ( valor - 32) * 5/9 + 273.15;
    } else if (temperaturaOrigen.equals("Fahrenheit(F)") && temperaturaFinal.equals("Reaumur(R)")) {
        return (valor - 32)* 0.44444;
    }else if (temperaturaOrigen.equals("Fahrenheit(F)") && temperaturaFinal.equals("Rankine")) {
        return valor + 459.67;
   } 
	// de otras temperaturas a (F).
    else if (temperaturaOrigen.equals("Kelvin(K)") && temperaturaFinal.equals("Fahrenheit(F)")) {
        return ( valor - 273.15) * 9/5 + 32;
    } else if (temperaturaOrigen.equals("Reaumur(R)") && temperaturaFinal.equals("Fahrenheit(F)")) {
        return valor * 2.2500+ 32.00;
    }else if (temperaturaOrigen.equals("Rankine") && temperaturaFinal.equals("Fahrenheit(F)")) {
        return valor - 459.67;
   } 
	//de (K) a las otras temperaturas.
    else if (temperaturaOrigen.equals("Kelvin(K)") && temperaturaFinal.equals("Reaumur(R)")) {
        return (valor - 273.15)* 0.80000;
    } else if (temperaturaOrigen.equals("Kelvin(K)") && temperaturaFinal.equals("Rankine")) {
        return valor * 1.8;
    }
	// de otras temperaturas a (K).
    else if (temperaturaOrigen.equals("Reaumur(R)") && temperaturaFinal.equals("Kelvin(K)")) {
        return valor /0.80000+ 273.15;
    }else if (temperaturaOrigen.equals("Rankine") && temperaturaFinal.equals("Kelvin(K)")) {
        return valor * 5/9;
   } 
	//de (R) a las otras temperaturas.
    else if (temperaturaOrigen.equals("Reaumur(R)") && temperaturaFinal.equals("Rankine")) {
        return valor * 2.2500+ 491.67;
    }
	// de otras a (R)
    else if (temperaturaOrigen.equals("Rankine") && temperaturaFinal.equals("Reaumur(R)")) {
        return (valor - 491.67)* 0.44444;
   } else {
    	
		return valor; // No se realiza ninguna conversión si las monedas son las mismas
	}
	
	}
}
