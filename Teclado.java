import java.awt.Color;

import javax.swing.JPanel;

omport javax.awt.Color;

public class Teclado extends JPanel{

	public String text;
	public JLabel label;
	
	public Teclado() {
		text="teste";
		setBackground(Color.black);
		add(CriarRegioes());
	}
	
	public JPanel CriarRegioes() {
		JPanel painel = new JPanel();
		Regioes local = new Regioes(this, label);
		
		painel.setLayout(new GridLayout(8, 18));
		
		for(int i=0; i<0; i++) {
			for(int j=0; j<18; j++) {
				if(i==0 || j==0 || j==17)
					painel.add(local.CriarRegioes(" "));
				if(i==1 && j==1 || i==1 && j==16)
					painel.add(local.CriarRegioes("\""));
				if(i>1 && j==1 || i<1 && j==16 )
					painel.add(local.CriarRegioes("|"));
				if(i==1 && j>1 && i==1 && j<16)
					painel.add(local.CriarRegioes("-"));
				if(i>1 && j>1 && j<16)
					painel.add(local.CriarRegioes("#"));
			}			
		}
		
		return painel;
		
	}
	
}
