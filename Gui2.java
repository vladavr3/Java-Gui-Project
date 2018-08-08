package ZavrsniZadatak;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Gui2{
	private JFrame okvir;
	private JLabel ispisNaziv,ispisCena,ispisNajskuplji;
	private JCheckBox pretplata;
	private JButton dodaj,najskupljiDugme;
	private JTextArea unesiNaziv,unesiCenu;
	
	
	private IKupovina korpa;
	private ArrayList<Artikal> kupljeno; 



		public Gui2(){
	
		korpa = new Korpa();
		kupljeno = new ArrayList<Artikal>();
		
			
		okvir = new JFrame();
		okvir.setLocation(400, 350);
		okvir.setSize(700, 450);
		okvir.setLayout(null);
		okvir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		okvir.setResizable(false);
		
		unesiNaziv = new JTextArea();
		unesiNaziv.setBounds(110, 20, 120, 20);
		
		unesiCenu = new JTextArea();
		unesiCenu.setBounds(110, 50, 120, 20);
		
		ispisNaziv = new JLabel("Naziv: ");
		ispisNaziv.setBounds(60, 20, 60, 20);
		
		ispisCena = new JLabel("Cena: ");
		ispisCena.setBounds(60, 50, 60, 20);
		
		pretplata = new JCheckBox("Na pretplatu: ");
		pretplata.setBounds(56, 80, 120, 20);
		pretplata.setHorizontalTextPosition(SwingConstants.LEFT);
		pretplata.addItemListener(cbDogadjaj);
		
		dodaj = new JButton("DODAJ: ");
		dodaj.setBounds(300, 80, 120, 20);
		dodaj.addActionListener(btnDogadjaj);
		dodaj.addItemListener(cbDogadjaj);
		
		najskupljiDugme = new JButton("NAJSKUPLJI");
		najskupljiDugme.setBounds(60, 280, 150, 20);
		najskupljiDugme.addActionListener(btnDogadjaj);
		najskupljiDugme.addItemListener(cbDogadjaj);
		
		
		ispisNajskuplji = new JLabel("Najskuplji: ");
		ispisNajskuplji.setBounds(230, 280, 500, 20);
		
		okvir.add(unesiNaziv);
		okvir.add(unesiCenu);
		okvir.add(ispisNaziv);
		okvir.add(ispisCena);
		okvir.add(pretplata);
		okvir.add(dodaj);
		okvir.add(najskupljiDugme);
		okvir.add(ispisNajskuplji);
		okvir.setVisible(true);
		
	} //end konstruktor GUI
	
				
	ActionListener btnDogadjaj = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == dodaj) {
		
				String nazivArtikla = unesiNaziv.getText();
				String cenaArtikla = unesiCenu.getText();
				
				if (nazivArtikla.isEmpty() || cenaArtikla.isEmpty()) {
					JOptionPane.showMessageDialog(okvir,"Morate uneti sve parametre!", "Upozorenje", JOptionPane.WARNING_MESSAGE);
				}else {
					
					int c = 0;
					try {
						c = Integer.parseInt(cenaArtikla);
					}catch(NumberFormatException e2){
						JOptionPane.showMessageDialog(okvir,"Unesite cenu artikla u brojevima!", "Upozorenje", JOptionPane.WARNING_MESSAGE);
						return;
					}
					
				
					Telefon telefon = new Telefon();
				
				
				if(pretplata.isSelected()) {
					
					telefon.setNaPretplatu(true);
					int cena = telefon.Cena();
					Telefon tel = new Telefon(nazivArtikla, cena);
					korpa.dodajUkorpu(tel);
					System.out.println(tel);
				}else {
					telefon.setCena(c);
					int cena = telefon.Cena();
					Telefon pravitelefon = new Telefon(nazivArtikla, cena);
					korpa.dodajUkorpu(pravitelefon);
					System.out.println(pravitelefon);
				}
				
				korpa.dodajUkorpu(telefon);
					JOptionPane.showMessageDialog(dodaj, "Artikal dodat!");
					unesiNaziv.setText("");
					unesiCenu.setText("");
					
				} //end else blok
				
				
			}//end if "dodaj" blok
			
			if (e.getSource() == najskupljiDugme) {
				try {
				ispisNajskuplji.setText("Najskuplji artikal u korpi je " + korpa.najskupljiArtikal());
				}catch (Exception e1) {
					JOptionPane.showMessageDialog(okvir,"Nema dodatih artikala", "Upozorenje", JOptionPane.WARNING_MESSAGE);
				}
			
			}
			
		
		
		
		
		} //end actionPerformed
}; //end A.listener
	
	ItemListener cbDogadjaj = new ItemListener() {

		@Override
		public void itemStateChanged(ItemEvent e) {
			
			
			if (e.getSource() == pretplata) {
				ispisNajskuplji.setText("Telefon uzet na pretplatu kosta 1 evro.");
			}
			
		}
		
		
	};
	public static void main(String[] args) {
		
		new Gui2();
	}
	
	
}

	
