import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Calculator
{
    JFrame f;
    JTextField t1,t2;
    Font F=new Font("Arial Black",Font.BOLD,20);
    Color c=new Color(0,255,255);
    Color c1=new Color(230,255,242);
    JButton b[]=new JButton[17];
    int x=5,y=65,i;
    String s[]={"7","8","9","4","5","6","1","2","3",".","0","=","<-","/","*","-","+"};
    Calculator()
    {
        f=new JFrame("Calculator");
        t1=new JTextField();
        t2=new JTextField();
        t1.setEditable(false);
        t2.setEditable(false);
        f.getContentPane().setBackground(c1);
        t1.setFont(F);
        t2.setFont(F);
        t1.setBounds(5,10,285,50);
        t2.setBounds(5,65,285,50);
        f.add(t1);
        f.add(t2);
        Work w=new Work(this);
        for(i=0;i<12;i++)
        {
            b[i]=new JButton(s[i]);
            if(i%3==0 )
            {
                x=5;
                y=y+60;
            }
            else
            {
                x=x+70;
            }
            b[i].setBounds(x,y,70,60);
            b[i].addActionListener(w);
            b[i].setFont(F);
            f.add(b[i]);
        }
        x=215;
        y=125;
        for(i=12;i<17;i++)
        {
            b[i]=new JButton(s[i]);
            b[i].setBounds(x,y,70,48);
            b[i].setBackground(c);
            b[i].addActionListener(w);
            b[i].setFont(F);
            f.add(b[i]);
            y+=48;
        }
        f.setLayout(null);
        f.setSize(310,410);
        w.disableButton("+/*D=");
        f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
    public static void main(String ...s)
    {
        new Calculator();
    }
}
