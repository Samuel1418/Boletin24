/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin24;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Samuel
 */
public class Ventanas implements ActionListener, MouseListener{
    
     JFrame marco = new JFrame();
    JPanel fondo = new JPanel();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JLabel nombre = new JLabel("NOME");
    JLabel contra = new JLabel("PASSWORD");
    JButton premer = new JButton("PREMER");
    JButton limpar = new JButton("LIMPAR");
    JTextField liTexto= new JTextField();
    JTextField liTexto2= new JTextField();
    

    String[] list = {"Elementolista1", "Elementolista2", "Elementolista3"};
    JList lista = new JList(list);
    JButton boton = new JButton("BOTON");
    JTextArea area = new JTextArea("Area de texto");

    public void ventana() {
        marco.setSize(700, 700);
        marco.setVisible(true);
        fondo.setLayout(new BoxLayout(fondo, BoxLayout.Y_AXIS));
        fondo.add(panel1, BorderLayout.NORTH);
        fondo.add(panel2, BorderLayout.CENTER);
        marco.add(fondo);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
    limpar.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent e){
     liTexto.setText("");
     liTexto2.setText("");
     }
     }
     ); 
    }
    
    
    
        
        
    

    public void insertarPanel1() {
        panel1.setLayout(null);
        panel1.add(nombre);
        nombre.setBounds(100, 50, 100, 100);
        panel1.add(contra);
        contra.setBounds(100, 100, 100, 100);
        panel1.add(premer);
        premer.setBounds(200, 200, 100, 50);
        panel1.add(limpar);
        limpar.setBounds(400, 200, 100, 50);
        panel1.add(liTexto);
        liTexto.setBounds(200,70,400,50);
        liTexto.setVisible(true);
        panel1.add(liTexto2);
        liTexto2.setBounds(200,120,400,50);
        liTexto2.setVisible(true);
        panel1.setVisible(true);
    }

    public void insertarPanel2() {
        panel2.setLayout(null);
        panel2.add(lista);
        lista.setBounds(30, 50, 200, 200);
        panel2.add(boton);
        boton.setBounds(300, 150, 100, 50);
        panel2.add(area);
        area.setBounds(500, 70, 150, 150);
        panel2.setVisible(true);

        boton.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent e){
     String noombre=area.getText();
     area.setText(noombre+"\n"+lista.getSelectedValuesList());
     }
     }
     );
}

    @Override
    public void actionPerformed(ActionEvent ae) {
        JButton boton=  (JButton) ae.getSource();
      if(boton==limpar){
          liTexto.setText("");
          liTexto2.setText("");
      }
      
            
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent me) {
        area.setName(lista.getName());
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
