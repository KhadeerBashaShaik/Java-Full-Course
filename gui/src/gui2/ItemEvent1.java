package gui2;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class ItemEvent1 extends JFrame implements ItemListener{
	private static final long serialVersionUID = 1L;
	JComboBox <String> cb;
	JLabel l1;
	ItemEvent1(){
		cb=new JComboBox<String>();
		cb.addItem("red");
		cb.addItem("green");
		cb.addItem("yellow");
		cb.addItem("jaya prakash");
		cb.addItem("khadeer basha");
		l1=new JLabel("select text");
		Container con=getContentPane();
		con.setLayout(new FlowLayout());
		con.add(l1);
		con.add(cb);
		cb.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent e) {
		String s=" ";
		if(e.getSource()==cb)
		{
			s=cb.getSelectedItem().toString();
			JOptionPane.showMessageDialog(cb, s);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItemEvent1 i=new ItemEvent1();
		i.setSize(400,100);
		i.setVisible(true);
	}
}
