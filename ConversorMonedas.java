import javax.swing.*;
import java.util.Objects;

public class ConversorMonedas {

    public static void main(String[] args) {

        //Icon icon = new ImageIcon(ConversorMonedas.class.getResource("alura-logo.png"));
        Object[] opciones = {"Conversor de Monedas", "Conversor de Temperatura"};
        Object[] opcionesMonedas = {"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen", "De Pesos a Won Coreano", "De Dólar a pesos", "De Euro a Pesos", "De Libras a Pesos","De Yen a Pesos","De Won Coreano a Pesos"};
        Object[] opcionesTemperatura = {"De Celsius a Kelvin","De Celsius a Fahrenheit","De Fahrenheit a Celsius","De Fahrenheit a Kelvin","De Kelvin a Celsius","De Kelvin a Fahrenheit"};
        int respuesta = JOptionPane.YES_OPTION;
        while (respuesta == JOptionPane.YES_OPTION) {
            Object opcion = JOptionPane.showInputDialog(null, "Selecciona una opcion: ", "Elegir", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
                if (opcion.equals("Conversor de Monedas")) {
                    float opc = 0;
                    try {
                        opc = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir:"));
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Solo aceptamos numeros :D");
                    }
                    while (opc <= 0) {
                        JOptionPane.showMessageDialog(null, "Porfavor ingrese un numero mayor a 0");
                        opc = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir:"));
                    }
                    Object opcion2 = JOptionPane.YES_OPTION;
                    opcion2 = JOptionPane.showInputDialog(null, "Selecciona una opcion: ", "Elegir", JOptionPane.QUESTION_MESSAGE, null, opcionesMonedas, opcionesMonedas[0]);
                    if (opcion2.equals("De Pesos a Dólar")) {
                        float total = 0;
                        total = (float) (opc * 0.059);
                        JOptionPane.showMessageDialog(null, "Tienes $" + total + " Dolares");
                    } else if (opcion2.equals("De Pesos a Euro")) {
                        float total = 0;
                        total = (float) (opc * 0.054);
                        JOptionPane.showMessageDialog(null, "Tienes $" + total + " Euros");
                    } else if (opcion2.equals("De Pesos a Libras")) {
                        float total = 0;
                        total = (float) (opc * 0.046);
                        JOptionPane.showMessageDialog(null, "Tienes $" + total + " Libras");
                    } else if (opcion2.equals("De Pesos a Yen")) {
                        float total = 0;
                        total = (float) (opc * 8.51);
                        JOptionPane.showMessageDialog(null, "Tienes $" + total + " Yen Japonés");
                    } else if (opcion2.equals("De Pesos a Won Coreano")) {
                        float total = 0;
                        total = (float) (opc * 76.66);
                        JOptionPane.showMessageDialog(null, "Tienes $" + total + " Won Coreano");
                    } else if (opcion2.equals("De Dólar a pesos")) {
                        float total = 0;
                        total = (float) (opc * 17);
                        JOptionPane.showMessageDialog(null, "Tienes $" + total + " Pesos");
                    } else if (opcion2.equals("De Euro a Pesos")) {
                        float total = 0;
                        total = (float) (opc * 18.46);
                        JOptionPane.showMessageDialog(null, "Tienes $" + total + " Pesos");
                    } else if (opcion2.equals("De Libras a Pesos")) {
                        float total = 0;
                        total = (float) (opc * 21.60);
                        JOptionPane.showMessageDialog(null, "Tienes $" + total + " Pesos");
                    } else if (opcion2.equals("De Yen a Pesos")) {
                        float total = 0;
                        total = (float) (opc * 0.12);
                        JOptionPane.showMessageDialog(null, "Tienes $" + total + " Pesos");
                    } else if (opcion2.equals("De Won Coreano a Pesos")) {
                        float total = 0;
                        total = (float) (opc * 0.013);
                        JOptionPane.showMessageDialog(null, "Tienes $" + total + " Pesos");
                    } else {
                        JOptionPane.showMessageDialog(null, "Opcion invalida");
                    }
                    respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (respuesta == JOptionPane.NO_OPTION) {
                        JOptionPane.showMessageDialog(null, "Programa terminado");
                    }
                } else if (opcion.equals("Conversor de Temperatura")) {
                    float opc2 = 0;
                    boolean valido = false;
                    while (!valido) {
                        try {
                            opc2 = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la cantidad de temperatura que deseas convertir:"));
                            valido = true;
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Solo aceptamos numeros :D");
                        }
                    }
                    Object opcion3 = JOptionPane.YES_OPTION;
                    opcion3 = JOptionPane.showInputDialog(null, "Selecciona una opcion: ", "Elegir", JOptionPane.QUESTION_MESSAGE, null, opcionesTemperatura, opcionesTemperatura[0]);
                    if (opcion3.equals("De Celsius a Kelvin")) {
                        float total = 0;
                        total = (float) (opc2 + 273.15);
                        JOptionPane.showMessageDialog(null, "Son " + total + " Grados Kelvin");
                    } else if (opcion3.equals("De Celsius a Fahrenheit")) {
                        float total = 0;
                        total = ((9 * opc2) / 5) + 32;
                        JOptionPane.showMessageDialog(null, "Son " + total + " Grados Fahrenheit");
                    } else if (opcion3.equals("De Fahrenheit a Celsius")) {
                        float total = 0;
                        total = (5 * (opc2 - 32)) / 9;
                        JOptionPane.showMessageDialog(null, "Son " + total + " Grados Celsius");
                    } else if (opcion3.equals("De Fahrenheit a Kelvin")) {
                        float total = 0;
                        total = (float) (((5 * (opc2 - 32)) / 9) + 273.15);
                        JOptionPane.showMessageDialog(null, "Son " + total + " Grados Kelvin");
                    } else if (opcion3.equals("De Kelvin a Celsius")) {
                        float total = 0;
                        total = (float) (opc2 - 273.15);
                        JOptionPane.showMessageDialog(null, "Son " + total + " Grados Celsius");
                    } else if (opcion3.equals("De Kelvin a Fahrenheit")) {
                        float total = 0;
                        total = (float) (((9 * (opc2 - 273.15)) / 5) + 32);
                        JOptionPane.showMessageDialog(null, "Son " + total + " Grados Fahrenheit");
                    } else {
                        JOptionPane.showMessageDialog(null, "Opcion invalida");
                    }
                    respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (respuesta == JOptionPane.NO_OPTION) {
                        JOptionPane.showMessageDialog(null, "Programa terminado");
                    }
                } else {
                    JOptionPane.showInputDialog("Opcion invalida");
                }
            }
        }
}



