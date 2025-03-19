import java.awt.*;
import java.applet.Applet;
/*<Applet code=grid1.class width=800 height=800> 
</Applet>*/

public class grid1 extends Applet
{
  public void init()
{
 setLayout(new GridLayout(5,5));
 for(int i=0;i<5;i++)
{
   Button b1= new Button();
    b1.setBackground(Color.black);
   Button b2= new Button();
   Button b3= new Button();
b3.setBackground(Color.pink);
Button b4= new Button();

add(b1);
add(b2);
add(b3);
add(b4);

}
}
}
  