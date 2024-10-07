import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DameLaHora oyente = new DameLaHora();
		
		Timer temporizador = new Timer(5000, oyente); //El primer parametro es los milisegundos de cada cuanto tiempo se mostrara el mensaje
		
		temporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa el boton aceptar para detener el programa");
		
		System.exit(0); //Detiene la ejecucion del programa
	}

}
