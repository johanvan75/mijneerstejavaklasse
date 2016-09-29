/**
 * Created by johan on 15-9-2016.
 */
import java.applet.*;
import java.awt.*;

public class h4_5 extends Applet {

    public void init(){
        setBackground(Color.blue);
        setSize(300,400);

    }

    public void paint (Graphics g){
        g.setColor(Color.yellow);
        g.fillArc(10, 10, 100, 200, 10, 420);

    }



}