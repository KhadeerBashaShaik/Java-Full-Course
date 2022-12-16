package gui2;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class FocusGui1 extends JFrame implements FocusListener {
	JTextField t1,t2,t3,t4;
	FocusGui1(){
		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(20);
		t4=new JTextField(20);
		this.setTitle("FocusEvents");
		Container con=getContentPane();
		con.setLayout(new GridLayout(4,1));
		con.add(t1);	
		con.add(t2);
		con.add(t3);
		con.add(t4);
		this.pack();
		t1.addFocusListener(this);
		t2.addFocusListener(this);
		t3.addFocusListener(this);
		t4.addFocusListener(this);
	}
	public void focusGained(FocusEvent fe) {
		if(fe.getSource()==t1)
			t1.setBackground(Color.cyan);
		if(fe.getSource()==t2) {
			t2.setBackground(Color.GREEN);
		}
		if(fe.getSource()==t3) {
			t3.setBackground(Color.ORANGE);
			
		}
		if(fe.getSource()==t4) {
			t4.setBackground(Color.magenta);
		}
	}
	public void focusLost(FocusEvent fe) {
		if(fe.getSource()==t1)
			t1.setBackground(Color.BLACK);
		if(fe.getSource()==t2)
			t2.setBackground(Color.BLACK);
		if(fe.getSource()==t3)
			t3.setBackground(Color.BLACK);
		if(fe.getSource()==t4)
			t4.setBackground(Color.BLACK);
	}
	public static void main(String [] args) {
		FocusGui1 fg=new FocusGui1();
		fg.setVisible(true);
		fg.setSize(400,400);
	}
	

}
