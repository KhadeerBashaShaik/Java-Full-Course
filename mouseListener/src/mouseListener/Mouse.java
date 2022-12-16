package mouseListener;

import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Mouse extends JFrame implements MouseListener{

	
	Mouse(){
		this.setSize(500,500);
		this.setVisible(true);
		setTitle("MOUSE EVENTS");
		addMouseListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mouse m=new Mouse();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int x=e.getX();
		int y=e.getY();
		JOptionPane.showMessageDialog(this, "MOUSE CLICKED AT "+x+"and "+y);
		if(x>200&&y>200)
			JOptionPane.showMessageDialog(this, "hello JAYA PRAKASH");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		int x=e.getX();
		int y=e.getY();
		JOptionPane.showMessageDialog(this, "MOUSE CLICKED AT "+x+"and "+y);
		if(x>200&&y>200)
			JOptionPane.showMessageDialog(this, "hello Khadeer basha");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		int x=e.getX();
		int y=e.getY();
		JOptionPane.showMessageDialog(this, "MOUSE Released AT "+x+"and "+y);
		if(x>200&&y>200)
			JOptionPane.showMessageDialog(this, "hello JAYA PRAKASH");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		int x=e.getX();
		int y=e.getY();
		JOptionPane.showMessageDialog(this, "MOUSE Entered AT "+x+"and "+y);
		if(x>200&&y>200)
			JOptionPane.showMessageDialog(this, "hello JAYA PRAKASH");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		int x=e.getX();
		int y=e.getY();
		JOptionPane.showMessageDialog(this, "MOUSE exited AT "+x+"and "+y);
		if(x>200&&y>200)
			JOptionPane.showMessageDialog(this, "hello JAYA PRAKASH");
	}

}
