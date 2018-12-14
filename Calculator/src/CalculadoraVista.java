import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class CalculadoraVista extends JFrame {
	private static final long serialVersionUID = 1L;
	protected JPanel panel;
	private Border borde;
	protected GridLayout layout;
	protected JTextField campoDeTexto;
	protected JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9, bPunto;
	protected JButton bMas, bMenos, bPor, bDiv, bSigno, bIgual, bBorraTodo, bBorrar, bPorcentaje ;
	
	
	public CalculadoraVista(String titulo){
		super(titulo);
		
		panel=new JPanel();
		
		borde=BorderFactory.createEmptyBorder(20,50,20,50);
		panel.setBorder(borde);
		layout = new GridLayout(6,4);
		panel.setLayout(layout);
		
		
		campoDeTexto=new JTextField("");
		bBorraTodo=new JButton("C");
		bBorrar=new JButton("<-");
		bPorcentaje=new JButton("%");
		bDiv=new JButton("/");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		bPor=new JButton("x");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		bMenos=new JButton("-");
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		bMas=new JButton("+");
		b0=new JButton("0");
		bSigno=new JButton("+/-");
		bPunto=new JButton(".");
		bIgual=new JButton("=");
		
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(new JLabel(""));
		panel.add(campoDeTexto);
		panel.add(bBorraTodo);
		panel.add(bBorrar);
		panel.add(bPorcentaje);
		panel.add(bDiv);
		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		panel.add(bPor);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(bMenos);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(bMas);
		panel.add(b0);
		panel.add(bSigno);
		panel.add(bPunto);
		panel.add(bIgual);
		
		this.add(panel);
		
		this.setBounds(500, 200, 400, 500);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}
	
	public static void main (String [] args){
		CalculadoraVista pruebaCalculadoraVista= new CalculadoraVista("pruebaCalculadoraVista");
	}
}
