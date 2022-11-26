import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Interface extends JPanel {
	
	public Teclado teclado;
	public JLabel label;
	
	public Interface(Teclado teclado) {
		
		this.setBackground(Color.GRAY);
		
		label = new JLabel();
		label.setText(teclado.text);
		
		this.teclado=teclado 
		this.teclado.label=label;
		
		setLayout(new BorderLayout());
		add(label, BorderLayout.NORTH);
		add(teclado, BorderLayout.SOUTH);
	}
	
	

}
