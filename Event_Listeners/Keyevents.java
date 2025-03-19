import java.awt.*;
import java.awt.event.*;

public class Keyevents extends WindowAdapter implements KeyListener {

Label lb1,lb2;
Frame fm;
TextArea area;
Keyevents()
{
fm = new Frame("Java Keyboard events");
lb1=new Label("Demo on Keyboard Events");
lb2 = new Label();
area = new TextArea();
fm.add(lb1);
fm.add(lb2);
fm.add(area);
lb1.setBounds(20,200,600,30);

lb2.setBounds(20, 250, 600, 30);
area.setBounds (20, 300, 600, 30);
fm.setSize(600,600);
fm.setLayout(null);
fm.setVisible(true);
//fm.addMouseListener(this);
fm.addWindowListener(this);
Font myFont = new Font("Arial", Font.BOLD,16);
fm.setFont(myFont);
lb2.setForeground(Color.RED);

area.addKeyListener(this);
}

public void keyPressed(KeyEvent e) {}

public void keyReleased (KeyEvent e) {}

public void keyTyped(KeyEvent e)
{
String text = area.getText();
lb2.setText("HELLO!!!");
if ((e.getKeyChar() == 'M') || (e.getKeyChar() == 'm' ))
lb2.setText("GOOD MORNING !!!");
else if ((e.getKeyChar() == 'A') || (e.getKeyChar() == 'a' ))
lb2.setText("GOOD AFTERNOON !!!");

else if ((e.getKeyChar() == 'E' ) || (e.getKeyChar() == 'e' ))
lb2.setText("GOOD EVENING !!!");
else if ((e.getKeyChar() == 'N' ) || (e.getKeyChar() == 'n' ))
lb2.setText("GOOD NIGHT !!!");

}

public void windowClosing(WindowEvent e)
{
System.exit(0);
}

public static void main(String[] args)
{
new Keyevents();
}
}