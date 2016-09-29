/**
 * Created by johan on 15-9-2016.
 */
import java.applet.*;
import java.awt.*;

public class h4_7 extends Applet {

    public void init(){
        setSize(300,300);
    }

    public void paint (Graphics g){
        g.drawRoundRect(20, 20, 250, 250, 50, 50);
        g.fillOval(45, 45, 85, 85);
        g.fillOval(165, 45, 85, 85);
        g.fillOval(45, 165, 85, 85);
        g.fillOval(165, 165, 85, 85);

    }

}