package conversorMulti;


public class ConversorDeMoneda {
	
	//variables de tasa de cambio.
	private static final double TASA_CAMBIO_USD_EUR = 0.91;
    private static final double TASA_CAMBIO_USD_GBP = 0.78;
    private static final double TASA_CAMBIO_USD_ARS = 258.36;
    private static final double TASA_CAMBIO_USD_JPY = 142.09;
    private static final double TASA_CAMBIO_USD_KRW = 1298.37;
   
    
    
    // Metodos de conversion:

    public double convertirMoneda(double monto, String monedaOrigen, String monedaDestino) {
    	
    	// de USD a las otras tasas.
        if (monedaOrigen.equals("USD") && monedaDestino.equals("EUR")) {
            return monto * TASA_CAMBIO_USD_EUR;
        } else if (monedaOrigen.equals("USD") && monedaDestino.equals("GBP")) {
            return monto * TASA_CAMBIO_USD_GBP;
        }else if (monedaOrigen.equals("USD") && monedaDestino.equals("ARS")) {
            return monto * TASA_CAMBIO_USD_ARS;
        }else if (monedaOrigen.equals("USD") && monedaDestino.equals("JPY")) {
            return monto * TASA_CAMBIO_USD_JPY;
        }else if (monedaOrigen.equals("USD") && monedaDestino.equals("KRW")) {
            return monto * TASA_CAMBIO_USD_KRW;
        }
        // De las otras tasas a USD:
        else if (monedaOrigen.equals("EUR") && monedaDestino.equals("USD")) {
            return monto / TASA_CAMBIO_USD_EUR;
        } else if (monedaOrigen.equals("GBP") && monedaDestino.equals("USD")) {
            return monto / TASA_CAMBIO_USD_GBP;
        }else if (monedaOrigen.equals("ARS") && monedaDestino.equals("USD")) {
            return monto / TASA_CAMBIO_USD_ARS;
        } else if (monedaOrigen.equals("JPY") && monedaDestino.equals("USD")) {
            return monto / TASA_CAMBIO_USD_JPY;
        }else if (monedaOrigen.equals("KRW") && monedaDestino.equals("USD")) {
            return monto / TASA_CAMBIO_USD_KRW;
        }
       
        else {
            return monto; // No se realiza ninguna conversión si las monedas son las mismas
        }
    }
}
	
	
	
	
	
	
	
	
/*
    //Tipos de moneda:
    
    Moneda pesoArgentino = new Moneda("Peso Argentino $", "ARS", 260.39);
    Moneda dolar = new Moneda("Dolar $", "USD",1.0);
    Moneda euro = new Moneda("Euro €", "EUR", 0.91);
    Moneda librasEsterlinas = new Moneda("libras Esterlinas £", "GBP", 0.79);
    Moneda yen = new Moneda("Yen ¥", "JPY", 142.19);
    Moneda won = new Moneda("Won ₩", "KRW", 1296.57);
    
    //Algunos metodos:
    //pesoArgentino.convertirAMoneda(yen);
    //dolar.convertirAMoneda(pesoArgentino);
    //pesoArgentino.convertirAMoneda(euro);
    //euro.convertirAMoneda(pesoArgentino);
	//librasEsterlinas.convertirAMoneda(euro);
    //yen.convertirAMoneda(dolar);
   //won.convertirAMoneda(pesoArgentino);
  
 */   
    

