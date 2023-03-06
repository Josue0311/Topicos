import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
import java.lang.Exception;  

public class LoginRegister extends JFrame implements ActionListener{
	JButton btn1;
	JButton btn2;  
	JPanel p1;
	JPanel p2;
	JLabel userL;
	JLabel passwordL;
	JTextField txt1;
	JTextField txt2;
	
	public LoginRegister(){
		setTitle("LOGIN & REGISTER FROM");  
		btn1 = new JButton("INGRESAR");
		btn2 = new JButton("REGISTRARSE");
		p1 = new JPanel(new GridLayout(8, 4));
		//p2 = new JPanel(new GridLayout
		userL = new JLabel();
		passwordL = new JLabel();
		txt1 = new JTextField();
		txt2 = new JTextField();
		
		userL.setText("USERNAME");
		passwordL.setText("PASSWORD");
		
		p1.add(btn1);
		p1.add(btn2);
		p1.add(txt1);
		p1.add(txt2);
		p1.add(userL);
		p1.add(passwordL);
		
		btn1.addActionListener(this); 
		
		add(p1, BorderLayout.NORTH);
		
		this.setSize(300,150);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		String userLValue = txt1.getText();
		String passwordLValue = txt2.getText();
		
		if (userLValue.equals("edwin") && passwordLValue.equals("ruzo")){
			System.out.println("WELCOME");
		}else{  
			System.out.println("POR FAVOR INSERTA UN USUARIO Y CONTRASEÑA VALIDOS");  
		}
	}
	
	public static void main (String []Args){
		LoginRegister lr = new LoginRegister();
	}
	
}