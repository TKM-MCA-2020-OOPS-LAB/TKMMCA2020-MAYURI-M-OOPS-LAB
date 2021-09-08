import java.applet.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;

public class choiceprgm extends Applet implements ItemListener {

    Choice choice;
    int c; 

    public void init()
    {
        choice = new Choice();
        choice.addItem("SHAPES");
        choice.addItem("RECTANGLE");
        choice.addItem("SQUARE");
        choice.addItem("CIRCLE");
        choice.addItem("TRIANGLE");
        add(choice);
        choice.addItemListener(this);
    }

 public void itemStateChanged (ItemEvent e)
    {
         c= choice.getSelectedIndex();
         repaint();
    }

 public void paint(Graphics g)
	{
         super.paint(g);

         if (c == 1)
         {  
            g.drawString("Shape:"+choice.getItem(1),190,130);
            g.drawRect(170,170,150,150);
            g.setColor(Color.red);
            g.fillRect(170,170,150,150);
         }
         if (c == 2)
         {
             g.drawString("Shape:"+choice.getItem(2),190,130);
        	 g.drawRect(200,200,50,50);
             g.fillRect(200,200,50,50);
         }
         if (c == 3)
         {
            g.drawString("Shape:"+choice.getItem(3),190,130);
             g.drawOval(170,170,100,100);
             g.setColor(Color.blue);
             g.fillOval(170,170,100,100);
         }
         if (c ==4)
         {
             g.drawString("Shape:"+choice.getItem(4),50,250);
             int[] x={100,200,0};
             int[] y={0,200,200};
             g.drawPolygon(x,y,3);
             g.setColor(Color.orange);
             g.fillPolygon(x,y,3);

         }
	}
}
/*
<applet code="choiceprgm.class" width="500" height="700" border="2">
</applet>
*/ 