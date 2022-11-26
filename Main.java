import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {

		Teclado teclado = new Teclado();
		Interface interface = new Interface(teclado);
		Janela janela = new Janela(interface);
	}

}
