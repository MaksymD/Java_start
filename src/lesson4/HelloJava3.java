package lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class HelloJava3 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloJava3");
        frame.add(new HelloComponent3("Hello, Java!"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}

class HelloComponent3 extends JComponent
implements MouseMotionListener, ActionListener{
    String theMessage;
    int messageX = 125, messageY =95;
    JButton theButton;
    int colorIndex;
    static Color[] someColor = {
            Color.BLACK, Color.RED, Color.GREEN, Color.BLUE, Color.MAGENTA};
    public HelloComponent3(String message){
        theMessage = message;
        theButton = new JButton("Change color");
        setLayout(new FlowLayout());
        add(theButton);
        theButton.addActionListener(this);
        addMouseMotionListener(this);
    }
    public void paintComponent(Graphics g){
        g.drawString(theMessage, messageX, messageY);
    }
    public void mouseDragged(MouseEvent e){
        messageX = e.getX();
        messageY = e.getY();
        repaint();
    }
    public void mouseMoved(MouseEvent e){
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == theButton)
            changeColor();
    }
    synchronized private void changeColor(){
        if (++colorIndex == someColor.length)
            colorIndex = 0;
        setForeground(currentColor());
        repaint();
    }
    synchronized private Color currentColor(){
        return someColor[colorIndex];
    }
}
