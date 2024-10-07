import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class DameLaHora implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		Date ahora = new Date();
		
		System.out.println("Te muestro la hora cada 5 segundos: " + ahora);
	}
}
