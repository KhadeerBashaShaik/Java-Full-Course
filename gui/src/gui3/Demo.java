package gui3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Demo extends JFrame implements ActionListener{
	JLabel l1,l2,l3,l4,l5;
	JButton b1,b2;
	JComboBox <String> cb,cb1;
	JTextField t1,t2,t3,t4;
	JRadioButton r1,r2;
	Demo(){
		cb=new JComboBox <String>();
		cb1=new JComboBox <String>();
		this.setSize(700,500);
		this.setVisible(true);
		this.setTitle("Student");
		l1=new JLabel("ENTER ID");
		l2=new JLabel("Enter name");
		l3=new JLabel("Gender");
		l4=new JLabel("department");
		b1=new JButton("submit");
		r1=new JRadioButton("Male");
		r2=new JRadioButton("female");
		b2=new JButton("Reset");
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		t4=new JTextField();
		cb.addItem("cse");
		cb.addItem("ece");
		cb.addItem("bt");
		cb1.addItem("Male");
		cb1.addItem("female");
		Container con=getContentPane();
		con.setLayout(new GridLayout(5,2));
		con.add(l1);
		con.add(t1);
		con.add(l2);
		con.add(t2);
		con.add(l3);
		con.add(cb1);
		con.add(l4);
		con.add(cb);
		con.add(b1);
		con.add(b2);
		this.pack();
		b1.addActionListener(this);
		b2.addActionListener(this);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			String id=t1.getText();
			String name=t2.getText();
			String Gender=cb1.getSelectedItem().toString();
			String d=cb.getSelectedItem().toString();
			JOptionPane.showMessageDialog(this, "id="+id+"\nname="+name+"\ngender="+Gender+"\ndepartment="+d);
		}
		if(e.getSource()==b2)
		{   
			t1.setText("");
			t2.setText("");
		}
	}

}
