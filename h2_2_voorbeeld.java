/**
 * Created by johan on 15-9-2016.
 */
//Voorbeeld 2.2

import java.awt.*;
import java.applet.*;

public class h2_2_voorbeeld extends Applet {

    public void init() {
        setBackground(Color.magenta);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Welcome to Java!!", 50, 60 );
    }
}