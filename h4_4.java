/**
 * Created by johan on 15-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class h4_4 extends Applet {

    public void init() {
        setSize(500, 500);
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.drawString("Gewicht", 10, 10);
        g.drawString("Valerie", 75, 335);
        g.drawString("Jeroen", 150, 335);
        g.drawString("Hans", 225, 335);
        g.drawString("120", 10, 200);
        g.drawString("100", 10, 220);
        g.drawString("80", 10, 240);
        g.drawString("60", 10, 260);
        g.drawString("40", 10, 280);
        g.drawString("20", 10, 300);
        g.drawLine(50, 195, 400, 195);
        g.drawLine(50, 215, 400, 215);
        g.drawLine(50, 235, 400, 235);
        g.drawLine(50, 255, 400, 255);
        g.drawLine(50, 275, 400, 275);
        g.drawLine(50, 295, 400, 295);
        g.drawLine(0, 315, 500, 315);
        g.setColor(Color.magenta);
        g.fillRect(80, 275, 30, 40);
        g.fillRect(155, 215, 30, 100);
        g.fillRect(225, 235, 30, 80);

    }
}
