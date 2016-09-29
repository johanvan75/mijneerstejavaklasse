/**
 * Created by johan on 15-9-2016.
 */


import java.applet.*;
import java.awt.*;

@SuppressWarnings("serial")
public class h4_8_praktijkopdracht extends Applet {
    //declaratie
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init(){
        setSize(550,270);
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 150;
        hoogte = 80;
    }

    public void paint (Graphics g){
        //lijn
        g.drawLine(20, 20, 170, 20);
        g.drawString("Lijn", 85, 35);
        //rechthoek
        g.drawRect(20, 45, breedte, hoogte);
        g.drawString("Rechthoek", 65, 140);
        //afgeronde rechthoek
        g.drawRoundRect(20, 155, breedte, hoogte, 30, 30);
        g.drawString("Afgeronde rechthoek", 38, 250);
        //magenta gekleurde dingen
        g.setColor(Color.magenta);
        g.fillRect(185, 45, breedte, hoogte);
        g.fillOval(185, 155, breedte, hoogte);
        //taarpunt
        g.fillArc(350, 45, breedte, hoogte, 0, 45);
        //terug naar zwart voor de resterende dingen
        g.setColor(Color.black);
        g.drawOval(185, 45, breedte, hoogte);
        g.drawOval(350, 45, breedte, hoogte);
        g.drawOval(390, 155, 75, 75);
        g.drawString("Gevulde rechthoek met ovaal", 185, 140);
        g.drawString("Gevulde ovaal", 220, 250);
        g.drawString("Taarpunt met ovaal eromheen", 350, 140);
        g.drawString("Circkel", 410, 250);
    }


}