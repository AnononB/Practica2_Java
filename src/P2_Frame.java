import javax.swing.*;

public class P2_Frame {
    private JPanel panel1;
    private JButton ButtSumar;
    private JButton ButtResta;
    private JButton ButtMulti;
    private JButton ButtDividir;
    private JTextField textField1;
    private JTextField textField2;

    //Botones agregados y con nombres cambiados


    private void ButtSumarActionPerformed(java.awt.event.ActionEvent evt) {
        String t1 = textField1.getText();
        String t2 = textField2.getText();
        String resultado = Calculadora.sumar(t1,t2);

        System.out.println("ANSWER: " + resultado);

    }


    public static void main(String[] args) {


    }
}
