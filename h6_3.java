/**
 * Created by johan on 28-9-2016.
 */
import java.applet.Applet;
import java.awt.Graphics;

public class h6_3 extends Applet {

    private static final long serialVersionUID = 1L;
    int a, b, c;

    public void init() {
        a = 2000000000;
        b = 1000000000;
        c = a + b;
    }

    public void paint(Graphics g) {
        g.drawString("" + c, 20, 20);

    }
}
