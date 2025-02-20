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

public class TecladoenPantalla {
    public static void main(String[] args) {
        // Crear la ventana
        JFrame frame = new JFrame("Teclado en Pantalla");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650, 350);
        frame.setLayout(new BorderLayout());

        // Campo de texto donde aparecerán las letras
        JTextField textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 20));
        frame.add(textField, BorderLayout.NORTH);

        // Panel para los botones
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 10, 5, 4));

        // Botón de la letra "A"
        JButton buttonA = new JButton("A");
        buttonA.setFont(new Font("Arial", Font.BOLD, 25));
        
        JButton buttonB = new JButton("B");
        buttonB.setFont(new Font("Arial", Font.BOLD, 25));
        
        JButton buttonC = new JButton("C");
        buttonC.setFont(new Font("Arial", Font.BOLD, 25));
        
        JButton buttonD = new JButton("D");
        buttonD.setFont(new Font("Arial", Font.BOLD, 25));
        
        JButton buttonE = new JButton("E");
        buttonE.setFont(new Font("Arial", Font.BOLD, 25));
        
        JButton buttonF = new JButton("F");
        buttonF.setFont(new Font("Arial", Font.BOLD, 25));
        
        JButton buttonG = new JButton("G");
        buttonG.setFont(new Font("Arial", Font.BOLD, 25));
        
        JButton buttonH = new JButton("H");
        buttonH.setFont(new Font("Arial", Font.BOLD, 25));
        
        JButton buttonI = new JButton("I");
        buttonI.setFont(new Font("Arial", Font.BOLD, 25));
        
        JButton buttonJ = new JButton("J");
        buttonJ.setFont(new Font("Arial", Font.BOLD, 25));
        
        JButton buttonK = new JButton("K");
        buttonK.setFont(new Font("Arial", Font.BOLD, 25));
        
        JButton buttonL = new JButton("L");
        buttonL.setFont(new Font("Arial", Font.BOLD, 25));
        
        JButton buttonM = new JButton("M");
        buttonM.setFont(new Font("Arial", Font.BOLD, 25));
        
        JButton buttonN = new JButton("N");
        buttonN.setFont(new Font("Arial", Font.BOLD, 25));
        
        JButton buttonÑ = new JButton("Ñ");
        buttonÑ.setFont(new Font("Arial", Font.BOLD, 25));
        
        JButton buttonO = new JButton("O");
        buttonO.setFont(new Font("Arial", Font.BOLD, 25));
        
        JButton buttonP = new JButton("P");
        buttonP.setFont(new Font("Arial", Font.BOLD, 25));
        
        JButton buttonQ = new JButton("Q");
        buttonQ.setFont(new Font("Arial", Font.BOLD, 25));
        
        JButton buttonR = new JButton("R");
        buttonR.setFont(new Font("Arial", Font.BOLD, 25));
        
        JButton buttonS = new JButton("S");
        buttonS.setFont(new Font("Arial", Font.BOLD, 25));
       
        JButton buttonT = new JButton("T");
        buttonT.setFont(new Font("Arial", Font.BOLD, 25));
        
        JButton buttonU = new JButton("U");
        buttonU.setFont(new Font("Arial", Font.BOLD, 25));
        
        JButton buttonV = new JButton("V");
        buttonV.setFont(new Font("Arial", Font.BOLD, 25));
        
        JButton buttonW = new JButton("W");
        buttonW.setFont(new Font("Arial", Font.BOLD, 25));
        
        JButton buttonX = new JButton("X");
        buttonX.setFont(new Font("Arial", Font.BOLD, 25));
        
        JButton buttonY = new JButton("Y");
        buttonY.setFont(new Font("Arial", Font.BOLD, 25));
      
        JButton buttonZ = new JButton("Z");
        buttonZ.setFont(new Font("Arial", Font.BOLD, 25));
        
        JButton button1 = new JButton("1");
        button1.setFont(new Font("Arial", Font.BOLD, 25));
        
        JButton button2 = new JButton("2");
        button2.setFont(new Font("Arial", Font.BOLD, 25));
        
        JButton button3 = new JButton("3");
        button3.setFont(new Font("Arial", Font.BOLD, 25));
        
        JButton button4 = new JButton("4");
        button4.setFont(new Font("Arial", Font.BOLD, 25));
        
        JButton button5 = new JButton("5");
        button5.setFont(new Font("Arial", Font.BOLD, 25));
        
        JButton button6 = new JButton("6");
        button6.setFont(new Font("Arial", Font.BOLD, 25));
        
        JButton button7 = new JButton("7");
        button7.setFont(new Font("Arial", Font.BOLD, 25));
        
        JButton button8 = new JButton("8");
        button8.setFont(new Font("Arial", Font.BOLD, 25));
        
        JButton button9 = new JButton("9");
        button9.setFont(new Font("Arial", Font.BOLD, 25));
        
        JButton button0 = new JButton("0");
        button0.setFont(new Font("Arial", Font.BOLD, 25));
        
        JButton buttonSPACE= new JButton("SPACE");
        buttonSPACE.setFont(new Font("Arial", Font.BOLD, 25));
        
        // Agregar acción al botón
        buttonA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "A");
            }
        });
        
        buttonB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "B");
            }
        });
        
        buttonC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "C");
            }
        });
        
        buttonD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "D");
            }
        });
        
        buttonE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "E");
            }
        });
        
        buttonF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "F");
            }
        });
        
        buttonG.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "G");
            }
        });
        
        buttonH.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "H");
            }
        });
        
        buttonI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "I");
            }
        });
        
        buttonJ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "J");
            }
        });
        
        buttonK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "k");
            }
        });
        
        buttonL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "L");
            }
        });
        
        buttonM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "M");
            }
        });
        
        buttonN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "N");
            }
        });
        
        buttonÑ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "Ñ");
            }
        });
        
        buttonO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "O");
            }
        });
        
        buttonP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "P");
            }
        });
        
        buttonQ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "Q");
            }
        });
        
        buttonR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "R");
            }
        });
        
        buttonS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "S");
            }
        });
        
        buttonT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "T");
            }
        });
        
        buttonU.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "U");
            }
        });
        
        buttonV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "V");
            }
        });
        
        buttonW.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "W");
            }
        });
        
        buttonX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "X");
            }
        });
        
        buttonY.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "Y");
            }
        });
        
        buttonZ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "Z");
            }
        });
        
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "1");
            }
        });
        
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "2");
            }
        });
        
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "3");
            }
        });
        
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "4");
            }
        });
        
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "5");
            }
        });
        
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "6");
            }
        });
        
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "7");
            }
        });
        
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "8");
            }
        });
        
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "9");
            }
        });
        
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "0");
            }
        });
        
        buttonSPACE .addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + " ");
            }
        });
        
        // Agregar botón al panel
        panel.add(buttonA);
        panel.add(buttonB);
        panel.add(buttonC);
        panel.add(buttonD);
        panel.add(buttonE);
        panel.add(buttonF);
        panel.add(buttonG);
        panel.add(buttonH);
        panel.add(buttonI);
        panel.add(buttonJ);
        panel.add(buttonK);
        panel.add(buttonL);
        panel.add(buttonM);
        panel.add(buttonN);
        panel.add(buttonÑ);
        panel.add(buttonO);
        panel.add(buttonP);
        panel.add(buttonQ);
        panel.add(buttonR);
        panel.add(buttonS);
        panel.add(buttonT);
        panel.add(buttonU);
        panel.add(buttonV);
        panel.add(buttonW);
        panel.add(buttonX);
        panel.add(buttonY);
        panel.add(buttonZ);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button0);
        panel.add(buttonSPACE);
        
        
        
        
        // Agregar panel a la ventana
        frame.add(panel, BorderLayout.CENTER);
        
        // Hacer visible la ventana
        frame.setVisible(true);
    }
}
