/**
 * Created by johan on 29-9-2016.
 */
//Voorbeeld 6.4

import java.awt.*;
import java.applet.*;


public class h6_4_voorbeeld extends Applet {
    int a, b, c;
    double uitkomst;


    public void init() {
        a = 8;
        b = 8;
        c = 3;
        uitkomst = (a + b) / c;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}