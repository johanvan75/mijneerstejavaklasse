/**
 * Created by johan on 29-9-2016.
 */
//Voorbeeld 6.1

import java.awt.*;
import java.applet.*;


public class h6_1_voorbeeld extends Applet {
    int a;
    int b;
    int c;
    int uitkomst;

    public void init() {
        a = 7;
        b = 8;
        c = 3;
        uitkomst = (a + b) / c;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}