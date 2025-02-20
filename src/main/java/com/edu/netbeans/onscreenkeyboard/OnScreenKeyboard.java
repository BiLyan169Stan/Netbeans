/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.edu.netbeans.onscreenkeyboard;

/**
 *
 * @author brian
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OnScreenKeyboard {
    public static void main(String[] args) {
        // Crear la ventana
        JFrame frame = new JFrame("Teclado en Pantalla");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 300);
        frame.setLayout(new BorderLayout());

        // Campo de texto donde aparecerán las letras
        JTextField textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 20));
        textField.setHorizontalAlignment(JTextField.CENTER);
        frame.add(textField, BorderLayout.NORTH);

        // Panel para los botones con 4 filas y 10 columnas
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 10, 5, 4)); // Espaciado entre botones
        panel.setBackground(Color.LIGHT_GRAY);

        // Letras del teclado
        String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        for (char letra : letras.toCharArray()) {
            JButton button = new JButton(String.valueOf(letra));
            configurarBoton(button, textField);
            panel.add(button);
        }

        // Números del teclado
        String numeros = "1234567890 ";
        for (char numero : numeros.toCharArray()) {
            JButton button = new JButton(String.valueOf(numero));
            configurarBoton(button, textField);
            panel.add(button);
        }

        // Agregar panel a la ventana
        frame.add(panel, BorderLayout.CENTER);

        // Hacer visible la ventana
        frame.setVisible(true);
    }

    private static void configurarBoton(JButton button, JTextField textField) {
        button.setFont(new Font("Arial", Font.BOLD, 20));
        button.setFocusPainted(false);
        button.setBackground(Color.WHITE);
        button.setForeground(Color.BLACK);
        button.setHorizontalAlignment(SwingConstants.CENTER);
        button.setVerticalAlignment(SwingConstants.CENTER);

        // Acción del botón
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + button.getText());
            }
        });
    }
}


