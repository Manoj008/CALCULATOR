import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ClockTest extends JFrame {
    JPanel panel1, panel2;
    Timer timer;
    int x=0,y=0,z=0;
    int sx[],sy[];
    int mx[],my[];
    int hx[],hy[];
    float r=-90;
    int nox[],noy[],no=-60;
    Date date=new Date();
    int hours=date.getHours();
    int mins=date.getMinutes();
    int secs= date.getSeconds();

    public ClockTest() {

        x=secs+1;
        y=mins;
        if(hours>11)
            hours=hours-12;
        z=hours*5 + (mins/12);


        sx=new int[60];
        sx[0]=300;
        sy=new int[60];
        sy[0]=125;

        mx=new int[60];
        mx[0]=300;
        my=new int[60];
        my[0]=100;

        hx=new int[60];
        hx[0]=300;
        hy=new int[60];
        hy[0]=150;

        nox=new int[12];
        nox[0]=290;
        noy=new int[12];
        noy[0]=80;


        for(int j=1;j<60;j++) {
            r=r+6;
            sx[j] = (int) (300 + (175 * Math.cos(r*Math.PI/180)));
            sy[j]= (int) (300+(175* Math.sin(r*Math.PI/180)));

            mx[j] = (int) (300 + (200 * Math.cos(r*Math.PI/180)));
            my[j]= (int) (300+(200* Math.sin(r*Math.PI/180)));

            hx[j] = (int) (300 + (150 * Math.cos(r*Math.PI/180)));
            hy[j]= (int) (300+(150* Math.sin(r*Math.PI/180)));


        }

        for(int j=1;j<12;j++) {
            if(j>5){
                nox[j] = (int) (290 + (230 * Math.cos(no*Math.PI/180)));
                noy[j]= (int) (310+(220* Math.sin(no*Math.PI/180)));
                no=no+30;
            }
            else {
                nox[j] = (int) (300 + (220 * Math.cos(no * Math.PI / 180)));
                noy[j] = (int) (310 + (220 * Math.sin(no * Math.PI / 180)));
                no = no + 30;
            }
        }

        ScheduledExecutorService sec= Executors.newSingleThreadScheduledExecutor();
        sec.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                if(x==60) {
                    y++;
                    x=0;
                }
                if(y==12){
                    z++;
                }
                if(y==60)
                    y=0;
                if(z==60)
                    z=0;
                change(getGraphics());
            }
        },1,1, TimeUnit.SECONDS);

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                change(getGraphics());
            }
        });

        panel1 = new JPanel();
        panel1.setSize(600, 600);

        panel2 = new JPanel();
        panel2.setBounds(50, 50, 500, 500);

        setBounds(300, 100, 600, 600);
        setVisible(true);
        add(panel1);
        add(panel2);
    }

    public void change(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(90, 90, 420, 420);
        g.setColor(Color.WHITE);
        g.fillOval(250, 250, 100, 100);
        g.setColor(Color.RED);
        g.drawLine(300, 300, sx[x], sy[x]);
        g.setColor(Color.BLACK);
        g.drawLine(300, 300, mx[y], my[y]);
        g.setColor(Color.GREEN);
        g.drawLine(300, 300, hx[z], hy[z]);
        x++;
    }

    public static void main(String args[]) {
        ClockTest c = new ClockTest();
        c.paint(null);



    }

    public void paint(Graphics g) {
        Font f = new Font("serif", Font.BOLD, 30);
        g.setColor(Color.BLACK);
        g.fillOval(50, 50, 500, 500);
        g.setColor(Color.BLUE);
        g.fillOval(90, 90, 420, 420);
        g.setFont(f);
        g.setColor(Color.WHITE);

        g.drawString("12", nox[0], noy[0]);
        g.drawString("1", nox[1], noy[1]);
        g.drawString("2", nox[2], noy[2]);
        g.drawString("3", nox[3], noy[3]);
        g.drawString("4", nox[4], noy[4]);
        g.drawString("5", nox[5], noy[5]);
        g.drawString("6", nox[6], noy[6]);
        g.drawString("7", nox[7], noy[7]);
        g.drawString("8", nox[8], noy[8]);
        g.drawString("9",nox[9], noy[9]);
        g.drawString("10", nox[10], noy[10]);
        g.drawString("11", nox[11], noy[11]);

        g.fillOval(250, 250, 100, 100);
        timer.start();
    }
}