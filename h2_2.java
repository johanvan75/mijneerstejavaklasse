/**
 * Created by johan on 15-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class h2_2 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Johan", 50, 60 );
        g.setColor(Color.red);
        g.drawString("van Horick",50, 70);
    }
}
