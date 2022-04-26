import java.awt.Color;
import java.awt.Graphics;

public class Pintar {

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillArc(200, 140, 100, 100, 30, 300);
        g.setColor(Color.black);
        g.fillOval(250, 160, 10, 10);
        g.setColor(Color.pink);
        g.fillArc(350, 120, 80, 50, 0, 180);
        g.fillRect(350, 140, 80, 50);
        int vx[] = {350, 370, 390, 410, 430, 430, 350, 350};
        int vy[] = {240, 220, 240, 220, 240, 190, 190, 260};
        g.fillPolygon(vx, vy, 8);
        g.setColor(Color.white);
        g.fillOval(370, 150, 25, 25);
        g.fillOval(400, 150, 25, 25);
        g.setColor(Color.blue);
        g.fillOval(380, 160, 15, 15);
        g.fillOval(410, 160, 15, 15);
    }
}
