package ZavrsniZadatak;

import java.util.ArrayList;

public class Korpa implements IKupovina{
	
	
	ArrayList<Artikal> kupljeno;
	
	public Korpa() {
		kupljeno = new ArrayList<Artikal>();
	}
	
	@Override
	public void dodajUkorpu(Artikal a) {
		 kupljeno.add(a);
		}
	
	@Override
	public Artikal najskupljiArtikal() {
		
		Artikal max = (Artikal)kupljeno.get(0);  
		 for (Artikal artikal : kupljeno) {
			
			 if (artikal.Cena()>max.Cena()) {
				max = artikal;
			}
		}
		return max;
	} 
	

	
	// verzija u klasi korpa, kada se pozove kreira vise prozora, verovatno zbog duplog poziva konstruktora new Korpa();
	//Resenje je moglo da bude da se pozove direktno kupljeno.add(telefon); kada se pritisne dugme "dodaj",
	//ali se onda ne poziva metod dodajUkorpu().
	
	/*Korpa(){
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
		
		naPretplatu = new JCheckBox("Na pretplatu: ");
		naPretplatu.setBounds(56, 80, 120, 20);
		naPretplatu.setHorizontalTextPosition(SwingConstants.LEFT);
		naPretplatu.addItemListener(cbDogadjaj);
		
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
		okvir.add(naPretplatu);
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
				int c = Integer.parseInt(cenaArtikla);
				Artikal telefon = new Telefon(nazivArtikla, c);
				//IKupovina korpa = new Korpa();
				kupljeno.add(telefon);
				//korpa.dodajUkorpu(telefon);
				
				JOptionPane.showMessageDialog(dodaj, "Artikal dodat!");
				unesiNaziv.setText("");
				unesiCenu.setText("");
				
				}//end if blok
			
			if (e.getSource() == najskupljiDugme) {
				
				ispisNajskuplji.setText("Najskuplji artikal u korpi je " + najskupljiArtikal());
			}
			
			} //end actionPerformed

		}; //end A.listener
	
	ItemListener cbDogadjaj = new ItemListener() {

		@Override
		public void itemStateChanged(ItemEvent e) {
			
			if (e.getSource() == naPretplatu) {
				
			}
			if(e.getStateChange() == 1){
				
				ispisNajskuplji.setText("Telefon uzet na pretplatu kosta kosta 1 evro.");
			}
		}
		
		
	};
	
	
	
	

	public static void main(String[] args) {
		
		new Korpa();
		
		
	}*/

	




	



	

	

}
