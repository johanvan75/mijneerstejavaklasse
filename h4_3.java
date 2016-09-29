import java.awt.*;
import java.applet.*;

public class h4_3 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(50, 50, 100, 25);
        g.setColor(Color.black);
        g.drawLine(50, 50, 50, 200);
        g.setColor(Color.white);
        g.fillRect(50, 75, 100, 25);
        g.setColor(Color.blue);
        g.fillRect(50, 100, 100, 25);
    }
}