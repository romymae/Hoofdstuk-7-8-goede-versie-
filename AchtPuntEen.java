package hoofstuk7en8;

/**
 * Created by Romy Mae on 20-9-2016.
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class AchtPuntEen extends Applet {
    Button ok;
    Button reset;
    String schermtekst;
    TextField tekstvak;
    Label label;
    int schermb, schermh;

    public void init() {
        schermb = 1000;
        schermh = 600;
        setSize(schermb, schermh);
        tekstvak = new TextField(" ",20);
        ok = new Button();
        ok.setLabel("ok");
        reset = new Button();
        reset.setLabel("reset");
        label = new Label("type hier je tekst");
        Listen1 L = new Listen1();
        Listen2 L2 = new Listen2();
        ok.addActionListener(L);
        reset.addActionListener(L2);
        add(label);
        add(tekstvak);
        add(ok);
        add(reset);

    }

    public void paint(Graphics g) {
       g.drawString("U schreef: "+schermtekst,schermb/2, schermh/2);
    }


    private class Listen1 implements ActionListener
    {
        public void actionPerformed( ActionEvent e){

            schermtekst = tekstvak.getText();
            repaint();
        }
    }

    private class Listen2 implements ActionListener
    {
        public void actionPerformed (ActionEvent e){
            schermtekst ="";
            tekstvak.setText("");
            repaint();
        }

    }
}



