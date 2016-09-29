/**
 * Created by johan on 28-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class h6_1 extends Applet {

    float mainGeld, gedeeltdoor;

    public void init() {
        mainGeld=113;
        gedeeltdoor=mainGeld/4;
    }

    public void paint(Graphics g) {
        g.drawLine(80, 20, 80, 130);
        g.drawLine(40, 100, 120, 100);
        g.drawString("jan", 50, 40);
        g.drawString("ali", 50, 60);
        g.drawString("Jeannette", 25, 80);
        g.drawString("ik", 50, 100);
        g.drawString("" + gedeeltdoor, 90, 40);
        g.drawString("" + gedeeltdoor, 90, 60);
        g.drawString("" + gedeeltdoor, 90, 80);
        g.drawString("" + gedeeltdoor, 90, 100);
        g.drawString("" + mainGeld, 90, 120);
    }
}