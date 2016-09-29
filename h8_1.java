/**
 * Created by johan on 28-9-2016.
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class h8_1 extends Applet {
    TextField tekstvlak;
    Button ok, reset;
    String text;
    Label label;

    public void init() {
        setSize(400, 200);
        tekstvlak = new TextField("", 20);
        label = new Label("Schrijf hier uw text");
        ok = new Button("ok");
        reset = new Button("reset");
        ok.addActionListener(new OkListener());
        reset.addActionListener(new ResetListener());
        add(label);
        add(tekstvlak);
        add(ok);
        add(reset);
        text = "";
    }

    public void paint(Graphics g) {
        g.drawString(text, 50, 60);
    }

    class OkListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            text = tekstvlak.getText();
            repaint();
        }
    }

    class ResetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvlak.setText("");
            text = "";
            repaint();
        }
    }
}