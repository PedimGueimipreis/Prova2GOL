import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Regioes implements ActionListener {
	private Teclado teclado;
	private JLabel label;
	
	public Regioes(Teclado teclado, JLabel label) {
		
		this.teclado=teclado;
		this.label=label;		
	}
	
	public JButton CriarRegioes(String texto) {
		
		JButton regiao = new JButton();
		regiao.setText(texto);
		regiao.setBackground(Color.blue);
		
		regiao.addActionListener(this);
		
		if(regiao.getText()=="-")
			regiao.setBackground(Color.WHITE);
		if(regiao.getText()=="\"")
			regiao.setBackground(Color.WHITE);
		if(regiao.getText()=="|")
			regiao.setBackground(Color.WHITE);
		
		return regiao;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		JButton regiao( = JButton) e.getSource();
		Goleiro goleiro = new Goleiro(telcado, label, regiao);
		
		teclado.label.setFont(new Font("arial", Font.BOLD, 10));
		regiao.setBackground(Color.orange);
		
		if(regiao.getText()=="#") {
			System.out.println("Gol "+goleiro.Agarrar());	
		}
		
		if(regiao.getText()=="-") {
			System.out.println("Travessao "+goleiro.Agarrar());	
		}
		
		if(regiao.getText()==" ") {
			System.out.println("Fora "+goleiro.Agarrar());	
		}
		
		if(regiao.getText()=="|") {
			System.out.println("Trave "+goleiro.Agarrar());	
		}
		
		if(regiao.getText()=="\"") {
			System.out.println("Quina "+goleiro.Agarrar());	
		}
		
		
		
	}
	
	

}
