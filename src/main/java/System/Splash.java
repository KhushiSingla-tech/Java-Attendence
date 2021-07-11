package System;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Splash extends JWindow {

    static boolean isRegistered;
    private static JProgressBar progressBar = new JProgressBar();
    private static int count;
    private static Timer timer1;

    public Splash() {

        Container container = getContentPane();
        container.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255));
        panel.setBounds(1, 1, 500, 281);
        panel.setLayout(null);
        container.add(panel);

        ImageIcon imgThisImg = new ImageIcon(getClass().getClassLoader().getResource("image/splash.png"));
        JLabel label = new JLabel();
        label.setIcon(imgThisImg);
        label.setBounds(0, 0, 500, 281);
        panel.add(label);

        progressBar.setMaximum(50);
        progressBar.setBounds(128, 250, 250, 15);
        progressBar.setStringPainted(true);
        progressBar.setForeground(Color.black);
        progressBar.setBorderPainted(false);
        container.add(progressBar);
        loadProgressBar();
        setSize(503,283);
        setLocationRelativeTo(null);
//      setVisible(true);
    }

    private void loadProgressBar() {
        ActionListener al = new ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                count++;

                progressBar.setValue(count);

                if (count == 300) 
                {

                    timer1.stop();
                }
            }      
        };
        timer1 = new Timer(50, al);
        timer1.start();
    }

//    public static void main(String[] args) {
//        Splash execute = new Splash();
//    }
}