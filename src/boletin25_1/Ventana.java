package boletin25_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ventana implements ActionListener {

    JFrame marco;
    JPanel panel;
    JButton boton;
    JLabel label;

    public void amosar() {
        marco = new JFrame();
        panel = new JPanel();
        boton = new JButton("Premer");
        label= new JLabel();
        //panel.setLayout(null);
        panel.add(boton);
        panel.add(label);
        boton.addActionListener(this);

        marco.add(panel);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setSize(100, 100);
        marco.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (boton == e.getSource()) {
            label.setText("Premiches");
        }
        }
}
