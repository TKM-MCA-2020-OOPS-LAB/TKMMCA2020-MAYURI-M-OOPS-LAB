import java.applet.Applet;
import java.awt.Graphics;
/*<applet code = "figures.class" width = "500" height = "700"></applet>*/
public class figures extends Applet{
public void paint(Graphics g){		
g.drawLine(30,30, 300, 30);
g.drawRect(60, 80, 200, 40);
g.drawOval(200, 200, 200, 160);
}
}