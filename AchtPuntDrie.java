package hoofstuk7en8;

/**
 * Created by Romy Mae on 22-9-2016.
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class AchtPuntDrie extends Applet {
    Button oke;
    Button reset;
    TextField typebalk;
    Label label;
    int schermh,schermb;
    String schermtekst;
     double btw;
     double prijs;
     TextField tekst;

    public void init() {
        //schermgroote
        schermh = 1000;
        schermb = 1000;
        setSize(schermb, schermh);
        btw =1.21;
        tekst= typebalk;
        typebalk = new TextField("Voer hier het bedrag zonder BTW in",40);
        label = new Label("type hier uw bedrag");
        oke = new Button();
        reset = new Button();
        //label
        oke.setLabel("oke");
        reset.setLabel("Reset");
        //add
        add(label);
        add(typebalk);
        add (oke);
        add (reset);
        //listen class
        Listen1 L = new Listen1();
        oke.addActionListener(L);
        Listen2 L2 = new Listen2();
        reset.addActionListener(L2);
        Listen3 L3 = new Listen3();
        typebalk.addActionListener(L3);



    }


    public void paint(Graphics g){


    }
    private class Listen1 implements ActionListener
    {
        public void actionPerformed( ActionEvent e){
            prijs= Double.parseDouble(typebalk.getText());
            prijs= prijs*btw;
            typebalk.setText(String.format("%.2f",Double.valueOf(prijs)));
            repaint();
        }
    }
    private class Listen2 implements ActionListener
    {
        public void actionPerformed( ActionEvent e){
            typebalk.setText (null);
            repaint();
        }
    }
    private class Listen3 implements ActionListener
    {
        public void actionPerformed( ActionEvent e){
            prijs= Double.parseDouble(typebalk.getText());
            prijs= prijs*btw;
            typebalk.setText(String.format("%.2f",Double.valueOf(prijs)));
            repaint();
        }
    }




}
