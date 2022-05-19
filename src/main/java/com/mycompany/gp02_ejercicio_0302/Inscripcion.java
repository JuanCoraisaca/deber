/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gp02_ejercicio_0302;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author PC-1
 */
public class Inscripcion extends JFrame {

    private JPanel jPanel;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private List<JCheckBox> jCheckboxList;
    private List<JComboBox> JComboBox;
    
    public Inscripcion(String title) throws HeadlessException {
        super(title);
        this.setSize(400, 300);
        this.setLocation(30, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel);
    }
    
    public void iniciarComponentes() {
        this.jPanel = new JPanel();
        this.jPanel.setBackground(Color.RED);
        this.jPanel.setLayout(new GridLayout(4, 1));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarCombo();
        this.iniciarTexto();
        this.iniciarBoton();
        
    }
    
    public void iniciarPaneles() {
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        
        this.jPanel.add(this.jPanelList.get(0));
        this.jPanel.add(this.jPanelList.get(1));
        this.jPanel.add(this.jPanelList.get(2));
        this.jPanel.add(this.jPanelList.get(3));
    }

    public void iniciarEtiquetas() {
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("Selecione una Sede: "));
        this.jLabelList.add(new JLabel("Tipo documento: "));
        this.jLabelList.add(new JLabel("Ingrese su identificacion: "));
        
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(1).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jLabelList.get(2));
    }

    public void iniciarCombo() {
        JComboBox combo1 = new JComboBox();
        combo1.addItem("Selecione una opción");
        combo1.addItem("Matriz Cuenca");
        combo1.addItem("Matriz Guayaquil");
        combo1.addItem("Matriz Quito");
        this.jPanelList.get(0).add(combo1);
        combo1.setEnabled(true);
        
        JComboBox combo2 = new JComboBox();
        combo2.addItem("Selecione una opción");
        combo2.addItem("Cedula");
        combo2.addItem("Pasaporte");
        
        this.jPanelList.get(1).add(combo2);
        combo1.setEnabled(true);
        
    }

    public void iniciarTexto() {
        JTextField texto = new JTextField(20);
        this.jPanelList.get(2).add(texto);            
        texto.setEnabled(true);
    }
    
    public void iniciarBoton(){
        JButton boton = new JButton();
        boton.setText("Ingresar");
        this.jPanelList.get(3).add(boton);
        boton.setEnabled(true);
    }
    
}
