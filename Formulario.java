import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{

	private JLabel text1, text2, text3;
 	private JButton boton1;
 	private JTextField frame1;

	public Formulario(){
		setLayout(null);

		text1 = new JLabel("Select the prime you want");
		text1.setBounds(70,0,300,30);
		add(text1);

		text2 = new JLabel("version 0.0.1");
		text2.setBounds(200,250,300,30);
		add(text2);

		text3 = new JLabel("The prime you want is:");
		text3.setBounds(70,150,300,30);
		add(text3);

		frame1 = new JTextField();
		frame1.setBounds(100,50,100,30);
		add(frame1);

		boton1 = new JButton("Buscar");
		boton1.setBounds(100,100,100,30);
		add(boton1);
		boton1.addActionListener(this);
	}
		// configurar accion del boton
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == boton1){
			String number = frame1.getText();
			int num = Integer.parseInt(number);

			int a,c,i=2;
			double b;
				if(num==1){
					text3.setText("The prime you want is: 2");
				}
				if(num>1){
					if(num==2){
						text3.setText("The prime you want is: 3");
					}
					else{
				for(a=3;a>1;a=a+2){
					if(i!=num){
					for(c=a/2;c>1;c=c-1){
					b=a%c;
					if(b==0){
					c=1;
					}
					if(b != 0){	
						if(c==2){
							i=i+1;
							}
						}
					}
				}
					if(i==num){
						text3.setText("The prime you want is: " + a);
						a=0;
						i=2;
					}
				}
			}
			}
		}
	}


	public static void main(String args[]){
		Formulario formulario1 = new Formulario();
		formulario1.setVisible(true);
		formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario1.setSize(310, 310);
		formulario1.setLocationRelativeTo(null);    
		formulario1.setResizable(false);
		formulario1.setTitle("Prime numbers Finder");
	}
}