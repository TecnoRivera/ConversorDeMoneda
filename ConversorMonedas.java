import javax.swing.*;

public class ConversorMonedas {

    public static void main(String[] args) {
        Object [] opciones = {"Conversor de Monedas","Conversor de Temperatura"};
        Object opcion = JOptionPane.showInputDialog(null,"Selecciona una opcion: ","Elegir",JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);
    }

}
