package hoofstuk7en8;

/**
 * Created by Romy Mae on 21-9-2016.
 */

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class AchtPuntTwee extends Applet {
    Button V;
    Button M;
    Button LV;
    Button LM;
    int teller;
    int schermb, schermh;
    String schermtekst;
    int vrouw, man, vleerling, mleerling;


    public void init() {
        man = 0;
        vrouw = 0;
        vleerling = 0;
        mleerling = 0;
        schermb = 1000;
        schermh = 600;
        setSize(schermb, schermh);
        V = new Button();
        V.setLabel("vrouw");
        M = new Button("man");
        LV = new Button("potentiële vrouwelijke leerling");
        LM = new Button("potentiële mannelijke leerling");
        Listen1 v = new Listen1();
        Listen2 m = new Listen2();
        Listen3 lv = new Listen3();
        Listen4 lm = new Listen4();
        V.addActionListener(v);
        M.addActionListener(m);
        LV.addActionListener(lv);
        LM.addActionListener(lm);
        add(M);
        add(V);
        add(LM);
        add(LV);

    }

    public void methode() {

    }


    public void paint(Graphics g) {
        g.drawString("man: " + man, 50, 50);
        g.drawString("vrouw: " + vrouw, 50, 65);
        g.drawString("potentiële mannelijke leerling: " + mleerling, 50, 80);
        g.drawString("potentiële vrouwelijke leerling: " + vleerling, 50,95);

    }



        class Listen1 implements ActionListener

        {
            public void actionPerformed(ActionEvent e) {
                vrouw++;
                repaint();
            }
        }
        class Listen2 implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                man++;
                repaint();
            }
        }
        class Listen3 implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                vleerling++;
                repaint();
            }
        }
        class Listen4 implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                mleerling++;
                repaint();
            }
        }
    }