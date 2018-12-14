import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CalcControlador extends CalcVista{
	
	String buttonValue="";
	double firstNum;
	double secondNum;
	String operation;
	private static final long serialVersionUID = 1L;
	
	public CalcControlador(String title){
		super(title);
		
		//Escucha números:
		b0.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				buttonValue=b0.getText();
				campoDeTexto.setText(campoDeTexto.getText()+buttonValue);	
			}
		});
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				buttonValue=b1.getText();
				campoDeTexto.setText(campoDeTexto.getText()+buttonValue);	
			}
		});
		
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				buttonValue=b2.getText();
				campoDeTexto.setText(campoDeTexto.getText()+buttonValue);	
			}
		});
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				buttonValue=b3.getText();
				campoDeTexto.setText(campoDeTexto.getText()+buttonValue);
			}
		});
		b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				buttonValue=b4.getText();
				campoDeTexto.setText(campoDeTexto.getText()+buttonValue);
			}
		});
		b5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				buttonValue=b5.getText();
				campoDeTexto.setText(campoDeTexto.getText()+buttonValue);
			}
		});
		b6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				buttonValue=b6.getText();
				campoDeTexto.setText(campoDeTexto.getText()+buttonValue);
			}
		});
		
		b7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				buttonValue=b7.getText();
				campoDeTexto.setText(campoDeTexto.getText()+buttonValue);
			}
		});
		b8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				buttonValue=b8.getText();
				campoDeTexto.setText(campoDeTexto.getText()+buttonValue);
			}
		});
		b9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				buttonValue=b9.getText();
				campoDeTexto.setText(campoDeTexto.getText()+buttonValue);
			}
		});
		bPunto.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				buttonValue=bPunto.getText();
				campoDeTexto.setText(campoDeTexto.getText()+buttonValue);
			}
		});
		bSigno.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				double valorCampo= Double.parseDouble(campoDeTexto.getText());
				campoDeTexto.setText(""+valorCampo*(-1));
			}
		});
		bBorraTodo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				campoDeTexto.setText("");	
			}
		});
		bBorrar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				StringBuilder str= new StringBuilder();
				if(campoDeTexto.getText().length()>0){
					str.append(campoDeTexto.getText()).deleteCharAt(campoDeTexto.getText().length()-1);						
					campoDeTexto.setText(str.toString());
				}
			}
		});
		bMas.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				firstNum= Double.parseDouble(campoDeTexto.getText());
				campoDeTexto.setText("");	
				operation="+";
				
			}
		});
		bMenos.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				firstNum= Double.parseDouble(campoDeTexto.getText());
				campoDeTexto.setText("");	
				operation="-";
				
			}
		});
		bPor.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				firstNum= Double.parseDouble(campoDeTexto.getText());
				campoDeTexto.setText("");	
				operation="*";
				
			}
		});
		bDiv.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				firstNum= Double.parseDouble(campoDeTexto.getText());
				campoDeTexto.setText("");	
				operation="/";
				
			}
		});
		bPorcentaje.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				firstNum= Double.parseDouble(campoDeTexto.getText());
				campoDeTexto.setText("");	
				operation="%";
				
			}
		});
		bIgual.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				double resp=0;
				secondNum= Double.parseDouble(campoDeTexto.getText());
				switch(operation.charAt(0)){
				case '+':
					resp=firstNum+secondNum;
					break;
				case '-':
					resp=firstNum-secondNum;
					break;
				case '*':
					resp=firstNum*secondNum;
					break;
				case '/':
					resp=firstNum/secondNum;
					break;
				case '%':
					resp=firstNum*secondNum/100;
					break;
				}
				campoDeTexto.setText(""+resp);
			}
		});
		
	}
	/*
	public class escucha1 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			buttonValue=b1.getText();
			campoDeTexto.setText(campoDeTexto.getText()+buttonValue);
		}
	}
	*/
	
	public static void main (String[]args){
		CalcControlador prueba= new CalcControlador("Prueba");
	}

	
}
