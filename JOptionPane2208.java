package joptionpane22.pkg08;
import javax.swing.JOptionPane;

public class JOptionPane2208 {

    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Insira seu nome");
        String numero = JOptionPane.showInputDialog("Informe sua idade em numeros");
        int converter = Integer.parseInt(numero);
        if (converter >= 18){
            JOptionPane.showMessageDialog(null, texto+" com "+converter+" anos ja pode tirar a CNH");
        }
        if (converter < 18){
            JOptionPane.showMessageDialog(null, texto+" voce ainda nao pode tirar a CNH, voce tem apenas "+converter+" anos");
        }
    }
    
}
