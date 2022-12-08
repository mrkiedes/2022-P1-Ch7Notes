package ExamplePic;

import java.awt.*;
import java.applet.*;

public class Apple {
    public static void drawApple(Graphics g, int x, int y){
        drawBody(g, x, y);
        drawStem(g, x, y);
        drawLeaf(g, x, y);
    }
    public static void drawBody(Graphics g, int x, int y){
        g.setColor(Color.red);
        g.fillOval(x,y,20,20);
    }

    public static void drawStem(Graphics g, int x, int y){
        g.setColor(new Color(255, 128,64));
        g.fillRect(x, y, 5, 5);
    }

    public static void drawLeaf(Graphics g, int x, int y){
        g.setColor(Color.green);
        g.fillRect(x+5, y, 5, 5);
    }



}
