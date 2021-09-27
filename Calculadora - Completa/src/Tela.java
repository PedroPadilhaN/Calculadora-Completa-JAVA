 import javax.swing.JOptionPane;

public class Tela {
	public String informar(String campo) {
		return JOptionPane.showInputDialog(campo);
	}
	
	public void mostrar(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}
}
