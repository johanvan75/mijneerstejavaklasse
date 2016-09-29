/**
 * Created by johan on 29-9-2016.
 */
// Voorbeeld 8.5
        import java.awt.*;
        import java.applet.*;
        import java.awt.event.*;

public class h8_5_voorbeeld extends Applet {
    TextField tekstvak;
    Label label;
    String s;

    public void init() {
        tekstvak = new TextField("Klik op mij", 20);
        label = new Label("Type iets in het tekstvak " +
                "en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        add(tekstvak);
        s = "";
    }

    public void paint(Graphics g) {
        g.drawString(s, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            repaint();
        }
    }
}