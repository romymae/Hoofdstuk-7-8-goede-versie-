package hoofstuk7en8;

/**
 * Created by Romy Mae on 23-9-2016.
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class PraktijkOpdrachtH8 extends Applet {
    Button keer1;
    Button delen1;
    Button min1;
    Button plus1;
    TextField typebalk1;
    TextField typebalk2;
    Label label;
    int schermh, schermb;
    double waardeEen;
    double waardeTwee;
    double waardeDrie;

    public void init() {
        schermh = 1000;
        schermb = 1000;
        setSize(schermb, schermh);
        typebalk1 = new TextField("", 10);
        typebalk2 = new TextField("", 10);
        label = new Label("type hier uw calculaties");
        keer1 = new Button();
        delen1 = new Button();
        min1 = new Button();
        plus1 = new Button();
        keer1.setLabel("*");
        delen1.setLabel("/");
        min1.setLabel("-");
        plus1.setLabel("+");


        add(label);
        add(typebalk1);
        add(typebalk2);
        add(keer1);
        add(delen1);
        add(plus1);
        add(min1);
        Listen1 keer = new Listen1();
        keer1.addActionListener(keer);
        Listen2 delen = new Listen2();
        delen1.addActionListener(delen);
        Listen3 plus = new Listen3();
        plus1.addActionListener(plus);
        Listen4 min = new Listen4();
        min1.addActionListener(min);




    }
    public void paint (Graphics g){

    }

class Listen1 implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        waardeEen = Double.parseDouble(typebalk1.getText());
        waardeTwee = Double.parseDouble(typebalk2.getText());
        waardeDrie = waardeEen * waardeTwee;
        typebalk1.setText(String.valueOf(waardeDrie));
        typebalk2.setText(null);
        repaint();
    }
}

    class Listen2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            waardeEen = Double.parseDouble(typebalk1.getText());
            waardeTwee = Double.parseDouble(typebalk2.getText());
            waardeDrie = waardeEen / waardeTwee;
            typebalk1.setText(String.valueOf(waardeDrie));
            typebalk2.setText(null);
            repaint();
        }
    }

    class Listen3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            waardeEen = Double.parseDouble(typebalk1.getText());
            waardeTwee = Double.parseDouble(typebalk2.getText());
            waardeDrie = waardeEen + waardeTwee;
            typebalk1.setText(String.valueOf(waardeDrie));
            typebalk2.setText(null);
            repaint();
        }
    }

    class Listen4 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            waardeEen = Double.parseDouble(typebalk1.getText());
            waardeTwee = Double.parseDouble(typebalk2.getText());
            waardeDrie = waardeEen - waardeTwee;
            typebalk1.setText(String.valueOf(waardeDrie));
            typebalk2.setText(null);
            repaint();
        }
    }


}












