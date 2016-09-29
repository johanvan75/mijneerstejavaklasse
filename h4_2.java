/**
 * Created by johan on 15-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class h4_2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        // is de platte lijn van het huis aan de onderkant //
        g.drawLine(100, 250, 215, 250);
        // is de linker muur van het huis //
        g.drawLine(100, 150, 100, 250);
        // is de rechter muur van het huis //
        g.drawLine(215, 250, 215, 150);
        // is de platte lijn van het huis aan de bovenkant //
        g.drawLine(100, 150, 215, 150);
        // is de linker schuine streep van het dak //
        g.drawLine(100, 150, 150, 100);
        // is de rechter lijn van het schuine dak  //
        g.drawLine(215, 150, 150 , 100);
        // is de deur van het huis //
        g.drawRect(125, 200, 30, 50);
        // is het raam van het huis  //
        g.drawRect(180, 170, 30, 30);

    }
}
