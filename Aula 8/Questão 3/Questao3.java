import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Questao3 extends JFrame implements ActionListener {
    private JLabel label1, label2, label3, labelResultado;
    private JTextField t1, t2;
    private JComboBox<String> combo;
    private JCheckBox c1;
    private JButton botaoCalcular;

    private void criarComponentesJanela() {
        this.label1 = new JLabel("Número 1: ");
        this.t1 = new JTextField(10);
        this.label2 = new JLabel("Número 2: ");
        this.t2 = new JTextField(10);
        this.label3 = new JLabel("Operação: ");
        String[] operacoes = { "Somar", "Subtrair", "Multiplicar", "Dividir" };
        this.combo = new JComboBox<String>(operacoes);
        this.c1 = new JCheckBox("Mostrar resultado em JOptionPane");
        this.botaoCalcular = new JButton("Calcular");
        this.labelResultado = new JLabel("Resultado: ");
    }

    private void setarAtributosJanela() {
        this.setTitle("Calculadora");
        this.setSize(380, 230);
        this.setLocation(250, 150);
        this.getContentPane().setLayout(new GridLayout(5, 2, 5, 5));
        this.getContentPane().add(this.label1);
        this.getContentPane().add(this.t1);
        this.getContentPane().add(this.label2);
        this.getContentPane().add(this.t2);
        this.getContentPane().add(this.label3);
        this.getContentPane().add(this.combo);
        this.getContentPane().add(this.c1);
        this.getContentPane().add(this.botaoCalcular);
        this.getContentPane().add(this.labelResultado);
    }

    private void adicionarListeners() {
        this.botaoCalcular.addActionListener(this);
    }

    public Questao3() {
        this.criarComponentesJanela();
        this.setarAtributosJanela();
        this.adicionarListeners();
    }

    private void exibir(String mensagem, int tipo) {
        if (this.c1.isSelected()) {
            JOptionPane.showMessageDialog(null, mensagem, "Calculadora", tipo);
        }
        this.labelResultado.setText(mensagem);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botaoCalcular) {
            try {
                double n1 = Double.parseDouble(this.t1.getText().trim().replace(",", "."));
                double n2 = Double.parseDouble(this.t2.getText().trim().replace(",", "."));
                double resultado = 0;

                switch (this.combo.getSelectedIndex()) {
                    case 0:
                        resultado = n1 + n2;
                        break;
                    case 1:
                        resultado = n1 - n2;
                        break;
                    case 2:
                        resultado = n1 * n2;
                        break;
                    case 3:
                        if (n2 == 0) {
                            throw new ArithmeticException("Divisão por zero");
                        }
                        resultado = n1 / n2;
                        break;
                }

                this.exibir("Resultado: " + resultado, JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException erro) {
                this.exibir("Erro: digite números válidos.", JOptionPane.ERROR_MESSAGE);
            } catch (ArithmeticException erro) {
                this.exibir("Erro: não é possível dividir por zero.", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        JFrame janela = new Questao3();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
