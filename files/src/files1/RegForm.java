package files1;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.FileWriter;
public class RegForm extends JFrame implements ActionListener{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
JLabel l1,l2,l3,l4;
JTextField t1,t2,t3,t4;
JButton b1,b2;
RegForm(){
	this.setVisible(true);
	Container con=getContentPane();
	con.setLayout(new GridLayout(5,2));
	l1=new JLabel("enter your id");
	t1=new JTextField(30);
	l2=new JLabel("enter your name");
	t2=new JTextField(30);
	t3=new JTextField(30);
	t4=new JTextField(30);
	l3=new JLabel("enter your branch");
	l4=new JLabel("enter your section");
	b1=new JButton("register");
	b2=new JButton("cancel");
	con.add(l1);
	con.add(t1);
	con.add(l2);
	con.add(t2);
	con.add(l3);
	con.add(t3);
	con.add(l4);
	con.add(t4);
	con.add(b1);
	con.add(b2);
	b1.addActionListener(this);
	b2.addActionListener(this);
}
public void actionPerformed(ActionEvent ae) {
	if(ae.getSource()==b1)
	{
		try {
			FileWriter f=new FileWriter("reg.txt",true);
			f.write(t1.getText()+" "+t2.getText()+" "+t3.getText()+ " "+t4.getText()+"\n");
			f.close();
		}
		catch(IOException ie){
			System.out.println(ie.getMessage());
		}
	}
}
	public static void main(String[] args) {
	RegForm rf=new RegForm();
	rf.setSize(400,500);
	}
}
