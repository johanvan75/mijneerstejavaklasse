/**
 * Created by johan on 28-9-2016.
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class h8_3 extends Applet {
    TextField links, rechts;
    Button plus, minus, keer, gedeelt;
    double totaal, a, b;

    public void init(){
        setSize(500, 100);
        links = new TextField("", 20);
        rechts = new TextField("", 20);
        plus = new Button("+");
        plus.addActionListener( new PlusListener() );
        minus = new Button("-");
        minus.addActionListener( new MinusListener() );
        keer = new Button("*");
        keer.addActionListener( new KeerListener() );
        gedeelt = new Button("/");
        gedeelt.addActionListener( new GedeeltListener() );
        add(links);
        add(rechts);
        add(keer);
        add(gedeelt);
        add(plus);
        add(minus);
        totaal = 0;
        a = 0;
        b = 0;
    }

    class PlusListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            a = Double.parseDouble(links.getText());
            b = Double.parseDouble(rechts.getText());
            totaal = a + b;
            links.setText(Double.toString(totaal));
            rechts.setText("");
        }
    }

    class MinusListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            a = Double.parseDouble(links.getText());
            b = Double.parseDouble(rechts.getText());
            totaal = a - b;
            links.setText(Double.toString(totaal));
            rechts.setText("");
        }
    }

    class KeerListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            a = Double.parseDouble(links.getText());
            b = Double.parseDouble(rechts.getText());
            totaal = a * b;
            links.setText(Double.toString(totaal));
            rechts.setText("");
        }
    }

    class GedeeltListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            a = Double.parseDouble(links.getText());
            b = Double.parseDouble(rechts.getText());
            totaal = a / b;
            links.setText(Double.toString(totaal));
            rechts.setText("");
        }
    }
}
