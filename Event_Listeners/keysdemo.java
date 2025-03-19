import java.awt.*;
import java.awt.event.*;
public class keysdemo extends Frame implements KeyListener{
Label l;
keysdemo()
{
addKeyListener(this);

  
l=new Label();
l.setBounds(20,50,100,20);
add(l);
setSize(300,300);
setLayout(null);
setVisible(true);
}

public void keyPressed(KeyEvent e)
{
if(e.getKeyChar()=='M'||e.getKeyChar()=='m')
l.setText("Good Morning");

else if(e.getKeyChar()=='A'||e.getKeyChar()=='a')
l.setText("Good Afternoon");

else if(e.getKeyChar()=='E'||e.getKeyChar()=='e')
l.setText("Good Evening");

 if(e.getKeyChar()=='N'||e.getKeyChar()=='n')
l.setText("Good Night");

}
public void keyReleased(KeyEvent e){}
public void keyTyped(KeyEvent e){}

public static void main(String args[])
{
   new keysdemo();
}
}