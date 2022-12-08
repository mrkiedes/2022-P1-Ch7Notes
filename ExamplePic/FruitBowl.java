package ExamplePic;

import java.awt.*;
import java.applet.*;
public class FruitBowl extends Applet{

    public void paint(Graphics g){
        Bowl.drawBowl(g);
        Bowl.drawTable(g);

        Apple.drawApple(g,100, 100);
        Apple.drawApple(g,150, 110);
        Apple.drawApple(g,26, 5);
        Apple.drawApple(g,156, 123);


        Banana.drawPeel(g);
        Banana.drawSlices(g);
        Banana.drawUncut(g);
        Banana.drawBrown(g);

    }

}
