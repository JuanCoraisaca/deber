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
public class Inscripcion extends JFrame{
    private JPanel jPanel;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private List<JCheckBox> jCheckboxList;
    private List<JComboBox> JComboBox;

    public Inscripcion(String title) throws HeadlessException {
        super(title);
        this.setSize(500,600);
        this.setLocation(30, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel);
    }
    
    public void iniciarComponentes(){
        this.jPanel = new JPanel();
        this.jPanel.setBackground(Color.RED);
        this.jPanel.setLayout(new GridLayout(4,1));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarTextos();
        
        
    }
    
    public void iniciarPaneles(){
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
    public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("Selecione una Sede: "));
        this.jLabelList.add(new JLabel("Tipo documento: "));
        this.jLabelList.add(new JLabel("Ingrese su identificacion: "));
        
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(1).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jLabelList.get(2));
    }
    public void iniciarCombo(){
        this.JComboBox = new ArrayList<>();
        
    }
    
    public void iniciarTextos(){
        this.jTextFieldList = new ArrayList<>();
        this.jTextFieldList.add(new JTextField());
        
        this.jTextFieldList.get(2).setColumns(30);
        
        this.jPanelList.get(2).add(this.jTextFieldList.get(2));
    }
    
    
    
    
}
