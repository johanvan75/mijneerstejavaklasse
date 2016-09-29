/**
 * Created by johan on 28-9-2016.
 */
import java.applet.Applet;
import java.awt.Graphics;

public class h6_2 extends Applet {

    long uur, dag, jaar;

    public void init(){
        uur = 60 * 60;
        dag = 24 * uur;
        jaar = 365 * dag;
    }

    public void paint(Graphics g) {
        g.drawLine(30, 50, 150, 50);
        g.drawLine(30, 70, 150, 70);
        g.drawString("uur",30, 50);
        g.drawString("dag", 30, 70);
        g.drawString("jaar", 30, 90);
        g.drawString("" + uur, 70, 50);
        g.drawString("" + dag, 70, 70);
        g.drawString("" + jaar,70, 90);
    }

}