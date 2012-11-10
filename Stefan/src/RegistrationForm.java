import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class RegistrationForm extends JFrame {

public RegistrationForm(){
setTitle("Prijava za rabota");
setSize(350,700);
setLocationRelativeTo(null);

final JPanel panel=new JPanel();
getContentPane().add(panel);
panel.setLayout(null);

final JLabel ime=new JLabel("Ime*");
ime.setBounds(10,15,100,50);
panel.add(ime);

final JTextField ime1=new JTextField();
ime1.setBounds(75,30,150,20);
panel.add(ime1);




final JLabel prezime=new JLabel("Prezime*");
prezime.setBounds(10,50,100,50);
panel.add(prezime);

final JTextField prezime1=new JTextField();
prezime1.setBounds(75,65,150,20);
panel.add(prezime1);

final JLabel adresa=new JLabel("Adresa");
adresa.setBounds(10,85,100,50);
panel.add(adresa);

final JTextField adresa1=new JTextField();
adresa1.setBounds(75,100,150,20);
panel.add(adresa1);




final JLabel title=new JLabel("Opshtina");
title.setBounds(10,120,100,50);
panel.add(title);

String [] titleList={"Bitola","Resen","Novaci"};
final JComboBox combo=new JComboBox(titleList);
combo.setSelectedIndex(2);
combo.setBounds(75, 135, 150, 20);
panel.add(combo);




}

}
