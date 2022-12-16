package gui;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Login extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel p1,p2;
	JLabel l1,luid,lpwd;
	JButton bsub,breset;
	JTextField tuid;
	JPasswordField ppwd;
 Login(){
	 this.setVisible(true);
	 this.setSize(500, 500);
	 this.setTitle("Login Form");
	 Container c=getContentPane();
	 c.setBackground(Color.orange);
	 p1=new JPanel();
	 p2=new JPanel();
	 c.setLayout(new GridLayout(2,1));
	 c.add(p1);
	 c.add(p2);
	 p1.setBackground(Color.white);
	 p2.setBackground(Color.GREEN);
	 l1=new JLabel("Welcome to KL University");
	 p1.add(l1);
	 luid = new JLabel("enter LOGIN ID");
	 lpwd= new JLabel("enter PASSWORD");
	 tuid=new JTextField(20);
	 ppwd=new JPasswordField(20);
	 bsub=new JButton("LOGIN");
	 breset=new JButton("RESET");
	 p2.setLayout(new GridLayout(3,2));
	 p2.add(luid);
	 p2.add(tuid);
	 p2.add(lpwd);
	 p2.add(ppwd);
	 p2.add(bsub);
	 p2.add(breset);this.pack();
	 bsub.addActionListener(this);
	 breset.addActionListener(this);
 }
 public void actionPerformed(ActionEvent ae)
 {
	 String uid,pwd;
	 if(ae.getSource()==bsub) {
		 uid=tuid.getText();
		 pwd=new String(ppwd.getPassword());
		 if(uid.equals("klu")&&pwd.equals("klu12345"))
			 JOptionPane.showMessageDialog(breset, pwd);
		 else
			 System.out.println("invalid user");
	 }
	 if(ae.getSource()==breset)
	 {
		 tuid.setText("");
		 ppwd.setText("");
	 }
 }
 public static void main(String []args) {
	 Login l=new Login();
	 l.actionPerformed(null);
 }
}