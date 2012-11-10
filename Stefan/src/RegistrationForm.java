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


final JLabel zelba=new JLabel("Vo koja programa bi sakale da rabotite?");
zelba.setBounds(10,380,1000,50);
panel.add(zelba);

String [] titleList1={"Maya","Eclipse","MySQL"};
final JComboBox combo1=new JComboBox(titleList1);
combo1.setSelectedIndex(2);
combo1.setBounds(10, 440, 150, 20);
panel.add(combo1);

final JLabel zelba1=new JLabel("Jazici");
zelba1.setBounds(10,470,1000,50);
panel.add(zelba1);

JCheckBox chinButton = new JCheckBox();
chinButton.setBounds(10, 540, 20, 20);
panel.add(chinButton);
JCheckBox chinButton1 = new JCheckBox();
chinButton1.setBounds(10, 510, 20, 20);
panel.add(chinButton1);

JCheckBox chinButton2 = new JCheckBox();
chinButton2.setBounds(10, 570, 20, 20);
panel.add(chinButton2);

final JLabel zelba2=new JLabel("Angliski");
zelba2.setBounds(35,495,1000,50);
panel.add(zelba2);

final JLabel zelba3=new JLabel("Germanski");
zelba3.setBounds(35,525,1000,50);
panel.add(zelba3);

final JLabel zelba4=new JLabel("Francuski");
zelba4.setBounds(35,555,1000,50);
panel.add(zelba4);




JButton kopce=new JButton("Prijavi se");
kopce.setBounds(80, 630, 150, 20);
panel.add(kopce);
kopce.setToolTipText("Generates file");

kopce.addActionListener(new ActionListener(){

@Override
public void actionPerformed(ActionEvent event) {
// TODO Auto-generated method stub
if(ime1.getText().equals("")||prezime1.getText().equals("")){
	 JOptionPane.showMessageDialog(panel,"Polinjata so '*' treba da se popolneti","Izvestuvanje", JOptionPane.WARNING_MESSAGE);

}
else{
try{
FileWriter record=new FileWriter("D:/prijava.txt");
BufferedWriter out=new BufferedWriter(record);
out.write("--------------Prijava--------------"+"\r\n");
out.write("Ime: "+ime1.getText()+"\r\n");
out.write("Prezime: "+prezime1.getText()+"\r\n");
out.write("Adresa: "+adresa1.getText()+"\r\n");
out.write("Iskustvo: "+iskustvo1.getText()+"\r\n");
out.write("Jazici: "+jazik1.getText()+"\r\n");

out.write("Opshtina: "+combo.getSelectedItem()+"\r\n");
out.write("Programa: "+combo1.getSelectedItem()+"\r\n");
if(buton.isSelected()){
out.write("Knowlage: "+knowlageList[0]+"\r\n");
}
if(buton1.isSelected()){
out.write("Knowlage: "+knowlageList[1]+"\r\n");
}
if(buton2.isSelected()){
out.write("Knowlage: "+knowlageList[2]+"\r\n");
}
out.write("----------------------------------");
out.close();
JOptionPane.showMessageDialog(panel, "Prijavuvaneto e uspeshno");
}
catch(Exception e){

}}
}

});



}

}
