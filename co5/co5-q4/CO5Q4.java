import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class CO5Q4 extends Applet implements MouseListener
{
    int a,b;
    public void init()
    {
addMouseListener( this);
setBackground(Color.PINK);
    }

    public void paint(Graphics g)
    {
    int c[]={150,300,225};
    int d[]={150,150,25};
    g.drawPolygon(c,d,3);
    g.setColor(Color.BLACK);
    g.fillPolygon(c,d,3);

                             
       
    g.setColor(Color.orange);
    g.fillRect(150,150,150,200);          //House

    g.drawRect(150, 230,30,40);
    g.setColor(Color.black);
    g.fillRect(150,230,30,40);           //Windows
    g.drawRect(270, 230,30,40);
    g.setColor(Color.black);
    g.fillRect(270,230,30,40);

    g.drawRect(200, 200,50,150);         //Door
    g.setColor(Color.red);
    g.fillRect(200,200,50,150);

    
    g.drawArc(200,75,50,50,0,100);
    g.setColor(Color.red);
    g.fillArc(200,75,50,50,0,100);
    g.drawArc(180,85,50,50,0,100);
    g.fillArc(180,85,50,50,0,100);

        if(a>200 && a<300 && b>200 && b<300)
        {
            g.setColor(Color.blue);
            g.fillRect(200, 200, 50, 150);
        }
    }
    public void mouseClicked(MouseEvent e)
    {

    }
    public void mouseEntered(MouseEvent e)
    {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e)
    {
        a=e.getX();
        b=e.getY();
        repaint();

    }
    public void mouseReleased(MouseEvent e)
    {

    }

}
/*
<applet code="CO5Q4.class" width="500" height="700" border="2">
</applet>
*/