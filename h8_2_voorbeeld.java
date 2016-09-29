/**
 * Created by johan on 29-9-2016.
 */
//Voorbeeld 8.2

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class h8_2_voorbeeld extends Applet {
    Button knop;
    String schermtekst;

    public void init() {
        schermtekst = "Doet deze knop wel iets?";
        knop = new Button("Klik op mij");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString(schermtekst, 50, 60 );
    }

    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            schermtekst = "Ja, deze knop doet wel iets";
        }
    }
}