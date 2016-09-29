/**
 * Created by johan on 15-9-2016.
 */

import java.awt.*;
import java.applet.*;

public class h4_1 extends Applet {

    /**
     *
     */
    private static final long serialVersionUID = 2933763517665818785L;

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(40, 110, 190, 110);
        g.drawLine(40, 110, 110, 60);
        g.drawLine(190, 110, 110, 60);
    }
}