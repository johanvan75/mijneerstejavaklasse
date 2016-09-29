/**
 * Created by johan on 15-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class h2_1 extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Johan", 50, 60 );
    }
}
