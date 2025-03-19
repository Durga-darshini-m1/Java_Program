
import java.awt.*;
import java.awt.event.*;

public class keys extends Frame implements KeyListener
{
	 Label l;
	 keys()
	 {
		 addkeyListener(this);
		 l=new Label();
		 l.setBounds(100,100,200,40);
		 l.setFont(new Font ("Calibri",Font.BOLD,16));
		 add(l);
		 setSize(400,400);
		 setLayout(null);
		 setVisible(true);
	 }
	 public void keyPressed(KeyEvent e)
	 {
		 if(e.getKeyChar()='M'|| e.getKeyChar()='m')
			 l.setText("Good Morning");
		 if(e.getKeyChar()='A'||e.getKeyChar()='a');
		 l.setText("Good Afternoon");
		 if(e.getKeyChar()='E'||e.getKeyChar()='e');
		 l.setText("Good Evening");
		 if(e.getKeyChar()='N'||e.getKeyChar()='n');
		 l.setText("Good Night");
		 
	 }
	 public void keyReleased(KeyEvent e)
	 {
		  
	 }
	 public void keyTyped(KeyEvent e)
	 {
		  
	 }
	 public static void main(String args[])
	 {
		 new keys();
	 }
}