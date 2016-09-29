/**
 * Created by johan on 29-9-2016.
 */
//Voorbeeld 8.1

import java.awt.*;
import java.applet.*;


public class h8_1_voorbeeld extends Applet {
    Button knop;

    public void init() {
        knop = new Button();
        knop.setLabel( "Klik op mij" );
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString("Doet deze knop wel iets?", 50, 60 );
    }
}
