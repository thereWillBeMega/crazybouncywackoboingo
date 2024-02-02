import java.awt.*;
public class Ball {

   private int size;
   private Color color;
   private double xspeed;
   private double ixSpeed;
    private double yspeed;
    private double iySpeed;
    private int x,y;
    private static int cornerHits = 0;

    boolean cx1 = false;
    boolean cx2 = false;
    boolean cy1 = false;
    boolean cy2 = false;

    public Ball(int x, int y,double xspeed, double yspeed, int size, Color color){
        this.x = x;
        this.y=y;
        this.size = size;
        this.color = color;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
        ixSpeed = xspeed;
        iySpeed = yspeed;


    }

    public void paint(Graphics g2){
        g2.setColor(color);
        g2.fillOval(x,y,size,size);
    }

    public void move(Graphics g2){
        x+= xspeed;
        y+= yspeed;
        if(y > 800 - (size + 30)) {
            yspeed *= -1;
            cy1 = true;
            if(yspeed > -50 && yspeed < 50)
            yspeed*= 1.025;
            if(xspeed > -100 && xspeed < 100);
            xspeed*= 1.025;
        }
        if(y < 0) {
            yspeed *= -1;
            cy2 = true;
            if(yspeed > -50 && yspeed < 50)
            yspeed*= 1.025;
            if(xspeed > -100 && xspeed < 100);
            xspeed*= 1.025;
        }
        if(x > 1400-size) {
            xspeed *= -1;
            cx1 = true;
            if(xspeed > -50 && xspeed < 50)
            xspeed*= 1.025;
            if(yspeed > -50 && yspeed < 50)
                yspeed*= 1.025;
        }





        if(x < 0) {
            xspeed *= -1;
            cx2 = true;
            if(xspeed > -100 && xspeed < 100);
            xspeed*= 1.025;
            if(yspeed > -50 && yspeed < 50)
                yspeed*= 1.025;

        }

        if(cy1 && cx1){
            cornerHits++;
            corner(g2);
            xspeed = Math.abs(ixSpeed) * -1;
yspeed = Math.abs(iySpeed)* -1;
        }
        if(cy2 && cx1){
            cornerHits++;
            corner(g2);
            xspeed = Math.abs(ixSpeed) * -1;
            yspeed = Math.abs(iySpeed);

        }
        if(cy1 && cx2){
            cornerHits++;
            corner(g2);

            xspeed = Math.abs(ixSpeed);
            yspeed = Math.abs(iySpeed) * -1;
        }
        if(cy2 && cx2){
            cornerHits++;
            corner(g2);
            xspeed = Math.abs(ixSpeed);
            yspeed = Math.abs(iySpeed);
        }

        cx1 = false;
        cy1 = false;
        cx2 = false;
        cy2 = false;

    }

    public void corner(Graphics g2){
        g2.drawString("CORNER " + cornerHits, 800, 750);
    }


}
