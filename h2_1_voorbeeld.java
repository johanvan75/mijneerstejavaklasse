/**
 * Created by johan on 15-9-2016.
 */
/*

@(#)Show.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

//importeer de benodigde klassen uit de Java bibliotheek
import java.awt.*;
import java.applet.*;

//een klasse met de naam Show van het type Applet
public class h2_1_voorbeeld extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {

    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.drawString("Welcome to Java!!", 50, 60 );
    }

}