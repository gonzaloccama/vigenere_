package com.Vigenere;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

import com.jgoodies.forms.factories.*;
import com.sun.org.apache.bcel.internal.generic.JsrInstruction;
/*
 * Created by JFormDesigner on Sat May 12 16:28:53 COT 2018
 */

/**
 * @author Ccama
 */
public class Vigenere extends JFrame {
    public Vigenere() {
        initComponents();
        setLocationRelativeTo(this);
    }

    Model_Vigenere model_vige = new Model_Vigenere();

    private void btnCifrarActionPerformed(java.awt.event.ActionEvent e) {
        String text = textArea1.getText();
        String key = txtLlave.getText();

        textArea2.setText(model_vige.Encrypt(text, key));
    }

    private void btnDecifrarActionPerformed(java.awt.event.ActionEvent e) {
        String text = textArea1.getText();
        String key = txtLlave.getText();

        textArea2.setText(model_vige.Descrypt(text, key));
    }

    private void btnCleanActionPerformed(ActionEvent e) {
        textArea1.setText(null);
        textArea2.setText(null);
        txtLlave.setText(null);
        textArea1.grabFocus();
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        btnCifrar = new JButton();
        btnDecifrar = new JButton();
        scrollPane2 = new JScrollPane();
        textArea2 = new JTextArea();
        label1 = new JLabel();
        txtLlave = new JTextField();
        btnClean = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(79, 92, 127));

            //======== scrollPane1 ========
            {

                //---- textArea1 ----
                textArea1.setCaretColor(Color.white);
                textArea1.setBorder(null);
                textArea1.setForeground(Color.white);
                textArea1.setFont(new Font("Roboto Black", Font.BOLD, 16));
                textArea1.setBackground(new Color(75, 124, 255));
                textArea1.setMargin(new Insets(5, 5, 5, 5));
                scrollPane1.setViewportView(textArea1);
            }

            //---- btnCifrar ----
            btnCifrar.setText("Cifrar");
            btnCifrar.setBackground(new Color(0, 35, 127));
            btnCifrar.setForeground(Color.white);
            btnCifrar.setFont(new Font("Roboto Light", Font.BOLD, 14));
            btnCifrar.addActionListener(e -> btnCifrarActionPerformed(e));

            //---- btnDecifrar ----
            btnDecifrar.setText("Descifrar");
            btnDecifrar.setBackground(new Color(0, 35, 127));
            btnDecifrar.setForeground(Color.white);
            btnDecifrar.setFont(new Font("Roboto Light", Font.BOLD, 14));
            btnDecifrar.addActionListener(e -> btnDecifrarActionPerformed(e));

            //======== scrollPane2 ========
            {

                //---- textArea2 ----
                textArea2.setFont(new Font("Roboto Black", Font.BOLD, 16));
                textArea2.setForeground(Color.white);
                textArea2.setBackground(new Color(75, 124, 255));
                textArea2.setCaretColor(Color.white);
                scrollPane2.setViewportView(textArea2);
            }

            //---- label1 ----
            label1.setText("Ingrese Clave:");
            label1.setForeground(Color.white);
            label1.setFont(new Font("Roboto Black", Font.BOLD, 14));

            //---- txtLlave ----
            txtLlave.setBackground(new Color(75, 124, 255));
            txtLlave.setFont(new Font("Roboto Black", Font.BOLD, 16));
            txtLlave.setForeground(Color.white);
            txtLlave.setCaretColor(Color.white);

            //---- btnClean ----
            btnClean.setText("Limpiar");
            btnClean.setBackground(new Color(0, 35, 127));
            btnClean.setFont(new Font("Roboto Light", Font.BOLD, 14));
            btnClean.setForeground(Color.white);
            btnClean.addActionListener(e -> btnCleanActionPerformed(e));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(btnCifrar, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDecifrar, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClean, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(label1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLlave, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE))
                            .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE))
                        .addContainerGap())
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCifrar, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLlave, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1)
                            .addComponent(btnDecifrar, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClean, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        textArea1.setLineWrap(true);
        textArea1.setWrapStyleWord(true);
        textArea2.setLineWrap(true);
        textArea2.setWrapStyleWord(true);


    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JButton btnCifrar;
    private JButton btnDecifrar;
    private JScrollPane scrollPane2;
    private JTextArea textArea2;
    private JLabel label1;
    private JTextField txtLlave;
    private JButton btnClean;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
