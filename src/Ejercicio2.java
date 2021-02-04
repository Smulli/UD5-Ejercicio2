import javax.swing.JOptionPane;

public class Ejercicio2 {
	
	public static void main (String args[]) {
		
		String bienvenido = "Bienvenido Jose"; //Escribe un nombre prestablecido en la consola.
		System.out.print(bienvenido);
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");//Para escribir cualquier nombre en el recuadro.
		JOptionPane.showMessageDialog(null, "Sea usted bienvenido "+nombre);
	}

}
