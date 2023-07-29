package conversorMulti;
import javax.swing.JOptionPane;


public class MenuConversor {
	 public void mostrarMenu() {
	        boolean continuar = true;
	        while (continuar) {
	            String[] opcionesMenu = { "Conversor de Moneda", "Conversor de Temperatura", "Conversor de Masa" };
	            String opcionConversor = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion de Conversion:",
	                    "Menu", JOptionPane.QUESTION_MESSAGE, null, opcionesMenu, opcionesMenu[0]);

	            if (opcionConversor == null) {
	                continuar = false; // El usuario presionó "Cancelar"
	                JOptionPane.showMessageDialog(null, "Programa Finalizado!", "Muchas gracias.",
	                        JOptionPane.INFORMATION_MESSAGE);
	            } else {
	                switch (opcionConversor) {
	                case "Conversor de Moneda":
	                    mostrarConversorMoneda();
	                    break;
	                case "Conversor de Temperatura":
	                    mostrarConversorTemperatura();
	                    break;
	                case "Conversor de Masa":
	                    mostrarConversorMasa();
	                    break;
	                default:
	                    break;
	                }
	            }
	        }
	    }
	 

	    private void mostrarConversorMoneda() {
	    	boolean continuar = true;

	        while (continuar) {
	            String montoStr = JOptionPane.showInputDialog(null, "Ingrese el monto a convertir:");

	            if (montoStr == null) {
	                // El usuario presionó "Cancelar"
	                JOptionPane.showMessageDialog(null, "Volviendo al Menu!", "Muchas gracias.",
	                        JOptionPane.INFORMATION_MESSAGE);
	                return; // Salir del método, ya que no hay monto ingresado
	            }

	            try {
	                double monto = Double.parseDouble(montoStr);

	                String[] opcionesMoneda = { "USD", "EUR", "GBP", "ARS", "JPY", "KRW" }; // Opciones de conversion.
	                String monedaOrigen = (String) JOptionPane.showInputDialog(null, "Moneda origen:", "Seleccione Moneda",
	                        JOptionPane.QUESTION_MESSAGE, null, opcionesMoneda, opcionesMoneda[0]);

	                if (monedaOrigen == null) {
	                    // El usuario presionó "Cancelar"
	                    JOptionPane.showMessageDialog(null, "Volviendo al Menu!", "Muchas gracias.",
	                            JOptionPane.INFORMATION_MESSAGE);
	                    return; // Salir del método, ya que no hay moneda origen seleccionada
	                }

	                String monedaDestino = (String) JOptionPane.showInputDialog(null, "Moneda destino:",
	                        "Seleccione Moneda", JOptionPane.QUESTION_MESSAGE, null, opcionesMoneda, opcionesMoneda[0]);

	                if (monedaDestino == null) {
	                    // El usuario presionó "Cancelar"
	                    JOptionPane.showMessageDialog(null, "Volviendo al Menu!", "Muchas gracias.",
	                            JOptionPane.INFORMATION_MESSAGE);
	                    return; // Salir del método, ya que no hay moneda destino seleccionada
	                }

	                ConversorDeMoneda conversor = new ConversorDeMoneda();
	                double resultado = conversor.convertirMoneda(monto, monedaOrigen, monedaDestino);

	                String mensaje = String.format("%.2f %s = %.2f %s", monto, monedaOrigen, resultado, monedaDestino);
	                JOptionPane.showMessageDialog(null, mensaje, "Resultado de Conversión", JOptionPane.INFORMATION_MESSAGE);

	                int respConfirmacion = JOptionPane.showConfirmDialog(null, "¿Quieres seguir convirtiendo?",
	                        "Mensaje:", JOptionPane.YES_NO_OPTION);

	                if (respConfirmacion == JOptionPane.NO_OPTION) {
	                    continuar = false; // El usuario no desea seguir convirtiendo
	                    JOptionPane.showMessageDialog(null, "Volviendo al Menu!", "Muchas gracias.",
	                            JOptionPane.INFORMATION_MESSAGE);
	                }

	            } catch (NumberFormatException e) {
	                JOptionPane.showMessageDialog(null, "Valor no válido", "Intente de nuevo!", JOptionPane.WARNING_MESSAGE);
	            }
	        }

	    }
	    

	    private void mostrarConversorTemperatura() {

	    	boolean continuar = true;

	        while (continuar) {
	            String valorStr = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir:");

	            if (valorStr == null) {
	                // El usuario presionó "Cancelar"
	                JOptionPane.showMessageDialog(null, "Volviendo al Menu!", "Muchas gracias.",
	                        JOptionPane.INFORMATION_MESSAGE);
	                return; // Salir del método, ya que no hay valor ingresado
	            }

	            try {
	                double valor = Double.parseDouble(valorStr);

	                String[] opcionesTemperatura = { "Celsius(C)", "Fahrenheit(F)", "Kelvin(K)", "Reaumur(R)", "Rankine" };
	                String temperaturaOrigen = (String) JOptionPane.showInputDialog(null, "Temperatura de Origen:",
	                        "Menu Temperaturas", JOptionPane.QUESTION_MESSAGE, null, opcionesTemperatura,
	                        opcionesTemperatura[0]);

	                if (temperaturaOrigen == null) {
	                    // El usuario presionó "Cancelar"
	                    JOptionPane.showMessageDialog(null, "Volviendo al Menu!", "Muchas gracias.",
	                            JOptionPane.INFORMATION_MESSAGE);
	                    return; // Salir del método, ya que no hay temperatura origen seleccionada
	                }

	                String temperaturaFinal = (String) JOptionPane.showInputDialog(null, "Temperatura Final:",
	                        "Menu Temperaturas", JOptionPane.QUESTION_MESSAGE, null, opcionesTemperatura,
	                        opcionesTemperatura[0]);

	                if (temperaturaFinal == null) {
	                    // El usuario presionó "Cancelar"
	                    JOptionPane.showMessageDialog(null, "Volviendo al Menu!", "Muchas gracias.",
	                            JOptionPane.INFORMATION_MESSAGE);
	                    return; // Salir del método, ya que no hay temperatura final seleccionada
	                }

	                ConversorDeTemperatura conversor = new ConversorDeTemperatura();
	                double resultado = conversor.convertirTemperatura(valor, temperaturaOrigen, temperaturaFinal);

	                String mensaje = String.format("%.2f %s = %.2f %s", valor, temperaturaOrigen, resultado,
	                        temperaturaFinal);
	                JOptionPane.showMessageDialog(null, mensaje, "Resultado de Conversión", JOptionPane.INFORMATION_MESSAGE);

	                int respConfirmacion = JOptionPane.showConfirmDialog(null, "¿Quieres seguir convirtiendo?", "Mensaje:",
	                        JOptionPane.YES_NO_OPTION);

	                if (respConfirmacion == JOptionPane.NO_OPTION) {
	                    continuar = false; // El usuario no desea seguir convirtiendo
	                    JOptionPane.showMessageDialog(null, "Volviendo al Menu!", "Muchas gracias.",
	                            JOptionPane.INFORMATION_MESSAGE);
	                }

	            } catch (NumberFormatException e) {
	                JOptionPane.showMessageDialog(null, "Valor no válido", "Intente de nuevo!", JOptionPane.WARNING_MESSAGE);
	            }
	        }
	    	
	    }

	    private void mostrarConversorMasa() {

	    	boolean continuar = true;

	        while (continuar) {
	            String valorStr = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir:");

	            if (valorStr == null) {
	                // El usuario presionó "Cancelar"
	                JOptionPane.showMessageDialog(null, "Volviendo al Menu!", "Muchas gracias.",
	                        JOptionPane.INFORMATION_MESSAGE);
	                return; // Salir del método, ya que no hay valor ingresado
	            }

	            try {
	                double valor = Double.parseDouble(valorStr);

	                String[] opcionesMasa = { "Gramo(g)", "Kilogramo(Kg)" };
	                String masaOrigen = (String) JOptionPane.showInputDialog(null, "Medida de Origen:", "Menu medidas:",
	                        JOptionPane.QUESTION_MESSAGE, null, opcionesMasa, opcionesMasa[0]);

	                if (masaOrigen == null) {
	                    // El usuario presionó "Cancelar"
	                    JOptionPane.showMessageDialog(null, "Volviendo al Menu!", "Muchas gracias.",
	                            JOptionPane.INFORMATION_MESSAGE);
	                    return; // Salir del método, ya que no hay masa origen seleccionada
	                }

	                String masaFinal = (String) JOptionPane.showInputDialog(null, "Medida Final:", "Menu medidas:",
	                        JOptionPane.QUESTION_MESSAGE, null, opcionesMasa, opcionesMasa[0]);

	                if (masaFinal == null) {
	                    // El usuario presionó "Cancelar"
	                    JOptionPane.showMessageDialog(null, "Volviendo al Menu!", "Muchas gracias.",
	                            JOptionPane.INFORMATION_MESSAGE);
	                    return; // Salir del método, ya que no hay masa final seleccionada
	                }

	                ConversorDeMasa conversor = new ConversorDeMasa();
	                double resultado = conversor.convertirMasa(valor, masaOrigen, masaFinal);

	                String mensaje = String.format("%.2f %s = %.3f %s", valor, masaOrigen, resultado, masaFinal);
	                JOptionPane.showMessageDialog(null, mensaje, "Resultado de Conversión", JOptionPane.INFORMATION_MESSAGE);

	                int respConfirmacion = JOptionPane.showConfirmDialog(null, "¿Quieres seguir convirtiendo?", "Mensaje:",
	                        JOptionPane.YES_NO_OPTION);

	                if (respConfirmacion == JOptionPane.NO_OPTION) {
	                    continuar = false; // El usuario no desea seguir convirtiendo
	                    JOptionPane.showMessageDialog(null, "Volviendo al Menu!", "Muchas gracias.",
	                            JOptionPane.INFORMATION_MESSAGE);
	                }

	            } catch (NumberFormatException e) {
	                JOptionPane.showMessageDialog(null, "Valor no válido", "Intente de nuevo!", JOptionPane.WARNING_MESSAGE);
	            }
	        }
	    }
	    	
	    	
	    
	}