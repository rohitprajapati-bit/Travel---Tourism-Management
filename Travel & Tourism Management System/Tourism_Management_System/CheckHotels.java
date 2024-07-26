package Tourism_Management_System;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckHotels extends JFrame implements Runnable {
    Thread t1;

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12;
    JLabel[] label = new JLabel[] { l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12 };
    JLabel Caption;

    public void run() {

        String[] text = new String[] { "JW Marriott Hotel", "Mandarin Oriental Hotel", "Four Seasons Hotel",
                "Radisson Blue Hotel", "Classio Hotel", "The Bay Club Hotel", "Quick Stop Hotel",
                "Happy Mornings Hotel", "Moss View Hotel", "Luxury Hotels and Resorts" };

        try {
            for (int i = 0; i <= 10; i++) {
                label[i].setVisible(true);
                Caption.setText(text[i]);
                Thread.sleep(2500);
                label[i].setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    CheckHotels() {

        setBounds(390, 100, 800, 550);

        Caption = new JLabel();
        Caption.setBounds(50, 450, 1000, 70);
        Caption.setFont(new Font("Tahuma", Font.PLAIN, 40));
        Caption.setForeground(Color.white);
        add(Caption);

        ImageIcon i1 = null, i2 = null, i3 = null, i4 = null, i5 = null, i6 = null, i7 = null, i8 = null, i9 = null,
                i10 = null, i11 = null, i12 = null;
        ImageIcon[] image = new ImageIcon[] { i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12 };

        Image j1 = null, j2 = null, j3 = null, j4 = null, j5 = null, j6 = null, j7 = null, j8 = null, j9 = null,
                j10 = null, j11 = null, j12 = null;
        Image[] jImage = new Image[] { j1, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12 };

        ImageIcon k1 = null, k2 = null, k3 = null, k4 = null, k5 = null, k6 = null, k7 = null, k8 = null, k9 = null,
                k10 = null, k11 = null, k12 = null;
        ImageIcon[] kimage = new ImageIcon[] { k1, k2, k3, k4, k5, k6, k7, k8, k9, k10, k11, k12 };

        for (int i = 0; i <= 10; i++) {

            image[i] = new ImageIcon(ClassLoader.getSystemResource("icons/hotel" + (i + 1) + ".jpg"));
            jImage[i] = image[i].getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
            kimage[i] = new ImageIcon(jImage[i]);
            label[i] = new JLabel(kimage[i]);
            label[i].setBounds(0, 0, 800, 600);
            add(label[i]);

        }

        t1 = new Thread(this);
        t1.start();
        setVisible(true);

    }

    public static void main(String[] args) {
        new CheckHotels();

    }
}
