/**
 * Created by johan on 28-9-2016.
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class h8_2 extends Applet {
    Button man, vrouw, mleerling, vleerling;
    int mang, vrouwg, mleerlingg, vleerlingg, totaal;


    public void init(){
        setSize(350, 150);
        man = new Button("man");
        vrouw = new Button("vrouw");
        mleerling = new Button("potenti�le mannelijke leerling");
        vleerling = new Button("potenti�le vrouwlijke leerling ");
        man.addActionListener( new ManListener() );
        vrouw.addActionListener( new VrouwListener() );
        mleerling.addActionListener( new MleerlingListener() );
        vleerling.addActionListener( new VleerlingListener() );
        add(man);
        add(vrouw);
        add(mleerling);
        add(vleerling);
        mang = 0;
        vrouwg = 0;
        mleerlingg = 0;
        vleerlingg = 0;
        totaal = 0;
    }

    public void paint (Graphics g){
        g.drawString("Mannen : " + mang, 20, 60);
        g.drawString("Vrouwen : " + vrouwg, 20, 80);
        g.drawString("Mannelijke leerlingen : " + mleerlingg, 20, 100);
        g.drawString("Vrouwlijke leerlingen : " + vleerlingg, 20, 120);
        g.drawString("Totaal : " + totaal, 20, 140);
    }

    class ManListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            mang ++;
            totaal = mang + vrouwg + mleerlingg + vleerlingg;
            repaint();
        }
    }

    class VrouwListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            vrouwg ++;
            totaal = mang + vrouwg + mleerlingg + vleerlingg;
            repaint();
        }
    }

    class MleerlingListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            mleerlingg ++;
            totaal = mang + vrouwg + mleerlingg + vleerlingg;
            repaint();
        }
    }

    class VleerlingListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            vleerlingg ++;
            totaal = mang + vrouwg + mleerlingg + vleerlingg;
            repaint();
        }
    }
}