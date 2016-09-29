/**
 * Created by johan on 28-9-2016.
 */
import java.applet.*;
import java.awt.*;

public class h6_4_praktijkopdracht extends Applet {
    double totaal, cijfer1, cijfer2, cijfer3;

    public void init(){
        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;

        totaal = ((cijfer1 + cijfer2 + cijfer3) / 3) * 10;
        totaal = (int) totaal;
        totaal = (double) totaal / 10;
    }
    public void paint(Graphics g){
        g.drawString("Het gemiddelde is : " + totaal, 20, 20);
    }
}
