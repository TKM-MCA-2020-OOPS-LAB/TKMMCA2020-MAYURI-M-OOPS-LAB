import java.awt.*;
import java.awt.event.*;
class Cal extends Frame implements ActionListener
{
    Frame f=new Frame();
    Label l1=new Label("Result");
    Label l2=new Label("First number");
    Label l3=new Label("Second number");

    TextField t1=new TextField();
    TextField t2=new TextField();
    TextField t3=new TextField();

    Button b1=new Button("Add");
    Button b2=new Button("Sub");
    Button b3=new Button("Mul");
    Button b4=new Button("Div");
    Button b5=new Button("Cancel");

Cal()
{
    l1.setBounds(60,100,100,30);
    l2.setBounds(60,140,100,25);
    l3.setBounds(60,180,100,25);

    t1.setBounds(200,100,180,30);
    t2.setBounds(200,140,100,25);
    t3.setBounds(200,180,100,25);

    
    b1.setBounds(60,250,50,30);
    b1.setBackground(Color.pink);
    b2.setBounds(120,250,50,30);
    b2.setBackground(Color.pink);
    b3.setBounds(180,250,50,30);
    b3.setBackground(Color.pink);
    b4.setBounds(240,250,50,30);
    b4.setBackground(Color.pink);
    b5.setBounds(300,250,50,30);
    b5.setBackground(Color.pink);

    b1.setForeground(Color.blue);
    b2.setForeground(Color.blue);
    b3.setForeground(Color.blue);
    b4.setForeground(Color.blue);
    b5.setForeground(Color.blue);


    f.add(l1);
    f.add(l2);
    f.add(l3);

    f.add(t1);
    f.add(t2);
    f.add(t3);

    f.add(b1);
    f.add(b2);
    f.add(b3);
    f.add(b4);
    f.add(b5);

    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);

    f.setLayout(null);
    f.setVisible(true);
    f.setSize(400,400);
    f.setLocation(500,200);
    f.setBackground(Color.gray);
}
public void actionPerformed(ActionEvent e)
{
    int n1=Integer.parseInt(t2.getText());
    int n2=Integer.parseInt(t3.getText());

    if(e.getSource()==b1)
    {
    t1.setText(String.valueOf(n1+n2));
    }

    if(e.getSource()==b2)
    {
    t1.setText(String.valueOf(n1-n2));
    }

    if(e.getSource()==b3)
    {
    t1.setText(String.valueOf(n1*n2));
    }

    if(e.getSource()==b4)
    {
    t1.setText(String.valueOf(n1/n2));
    }

    if(e.getSource()==b5)
    {
    System.exit(0);
    }
}

public static void main(String args[])
{
new Cal();
}
}
    
    
    