/*
 * Clase que contiene la funcionalidad de la ventana
 */

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ControladorCine extends VistaCine {
	
	public class EscuchaCalcula implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String leeAdu, leeNin, leeClas;
			int canAdu=0, canNin=0, canPagar;
			
			leeAdu = txtAdulto.getText();
			leeNin = txtNinio.getText();
			leeClas = txtClas.getText();
			canAdu = Integer.parseInt(leeAdu);
			canNin = Integer.parseInt(leeNin);
			// valido si puedo cobrar
			if (!leeNin.equals("0") && leeClas.equalsIgnoreCase("C")) {
				lblTotal.setText("No pueden entrar niños");
				txtAdulto.setText("");
				txtNinio.setText("");
				txtClas.setText("");
			}
			else {
				if (leeClas.equalsIgnoreCase("A"))
					canPagar = canAdu*120 + canNin*30;
				else
					if (leeClas.equalsIgnoreCase("B"))
						canPagar = canAdu * 130 + canNin*30;
					else
						canPagar = canAdu*150;
				lblTotal.setText("Total a pagar "+canPagar);
			}
			
			
		}
		
	}
	
	public ControladorCine() {
		super();
		bt1.addActionListener(new EscuchaCalcula());
	}

}
