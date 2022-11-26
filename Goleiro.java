import java.util.Random;

import javax.swing.JButton;

public class Goleiro extends Regioes{
	private JButton regiao;
	public String text;
	private int linha, coluna;
	
	public Goleiro(Teclado teclado, JLabel label, JButon regiao) {
		super(teclado, label);
		Random gerar = new Random();
		
		linha = gerar.nextInt(8);
		coluna = gerar.nestInt(18);
		this.regiao=regiao;
		
		Agarrar();
	}
	
	public String Agarrar() {
		JButton botaogoleiro = new JButton();
		
		botaogoleiro.setLocation(linha, coluna);
		
		if(regiao.getLayout()<botatogoleiro>.getLayout()) {
			text="Goleiro defendeu.";
			return text;			
		} else {
			text="Goleiro frangou.";
			return text;
		}
				
	}

}
