import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Questao6 extends JFrame implements ItemListener {
    private JLabel label1;
    private JCheckBox cNegrito, cItalico;
    private JRadioButton radioPequeno, radioMedio, radioGrande;
    private ButtonGroup radiogroup;

    private void criarComponentesJanela() {
        this.label1 = new JLabel("O rato roeu a roupa do rei de Roma");
        this.label1.setFont(new Font("Arial", Font.PLAIN, 16));
        this.cNegrito = new JCheckBox("Negrito");
        this.cItalico = new JCheckBox("Itálico");
        this.radioPequeno = new JRadioButton("Pequeno");
        this.radioMedio = new JRadioButton("Médio");
        this.radioGrande = new JRadioButton("Grande");
        this.radiogroup = new ButtonGroup();
    }

    private void setarAtributosButtonGroup() {
        this.radiogroup.add(this.radioPequeno);
        this.radiogroup.add(this.radioMedio);
        this.radiogroup.add(this.radioGrande);
        this.radioMedio.setSelected(true);
    }

    private void setarAtributosJanela() {
        this.setTitle("Preferências de Texto");
        this.setSize(420, 150);
        this.setLocation(250, 150);
        this.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        this.getContentPane().add(this.label1);
        this.getContentPane().add(this.cNegrito);
        this.getContentPane().add(this.cItalico);
        this.getContentPane().add(this.radioPequeno);
        this.getContentPane().add(this.radioMedio);
        this.getContentPane().add(this.radioGrande);
    }

    private void adicionarItemListeners() {
        this.cNegrito.addItemListener(this);
        this.cItalico.addItemListener(this);
        this.radioPequeno.addItemListener(this);
        this.radioMedio.addItemListener(this);
        this.radioGrande.addItemListener(this);
    }

    public Questao6() {
        this.criarComponentesJanela();
        this.setarAtributosButtonGroup();
        this.setarAtributosJanela();
        this.adicionarItemListeners();
    }

    public void itemStateChanged(ItemEvent e) {
        int estilo = Font.PLAIN;
        if (this.cNegrito.isSelected()) {
            estilo = estilo + Font.BOLD;
        }
        if (this.cItalico.isSelected()) {
            estilo = estilo + Font.ITALIC;
        }

        int tamanho = 16;
        if (this.radioPequeno.isSelected()) {
            tamanho = 12;
        } else if (this.radioGrande.isSelected()) {
            tamanho = 24;
        }

        this.label1.setFont(new Font("Arial", estilo, tamanho));
    }

    public static void main(String[] args) {
        JFrame janela = new Questao6();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
