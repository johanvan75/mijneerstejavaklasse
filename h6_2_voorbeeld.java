/**
 * Created by johan on 29-9-2016.
 */
// Voorbeeld 6.2

import java.awt.*;
import java.applet.*;


public class h6_2_voorbeeld extends Applet {
    int teller;

    public void init() {
        teller = 0;
    }

    public void paint(Graphics g) {
        teller++;
        g.drawString("Scherm is " + teller +
                " keer ververst.", 50, 60 );
    }
}
