
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


final JLabel Obrazovanie=new JLabel("Obrazovanie");
Obrazovanie.setBounds(10,160,100,50);
panel.add(Obrazovanie);


final String[] knowlageList={"Osnovno","Sredno","Visoko"};
final JRadioButton buton=new JRadioButton(knowlageList[0]);
final JRadioButton buton1=new JRadioButton(knowlageList[1]);
final JRadioButton buton2=new JRadioButton(knowlageList[2]);

buton.setActionCommand(knowlageList[0]);
buton1.setActionCommand(knowlageList[1]);
buton2.setActionCommand(knowlageList[2]);

buton.setSelected(true);

buton.setBounds(80, 210, 250, 15);
buton1.setBounds(80, 240, 250, 15);
buton2.setBounds(80, 270, 250, 15);


panel.add(buton);
panel.add(buton1);
panel.add(buton2);

ButtonGroup grupa=new ButtonGroup();
grupa.add(buton);
grupa.add(buton1);
grupa.add(buton2);

final JLabel iskustvo=new JLabel("Iskustvo");
iskustvo.setBounds(10,300,100,50);
panel.add(iskustvo);

final JTextField iskustvo1=new JTextField();
iskustvo1.setBounds(75,315,150,20);
panel.add(iskustvo1);

final JLabel jazik=new JLabel("Telefon");
jazik.setBounds(10,340,100,50);
panel.add(jazik);

final JTextField jazik1=new JTextField();
jazik1.setBounds(75,355,150,20);
panel.add(jazik1);






}

}