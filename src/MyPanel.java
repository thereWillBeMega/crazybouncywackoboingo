import javax.swing.*;
import java.awt.*;
import java.util.*;
public class MyPanel extends JPanel{


    private Color[] colors = {Color.BLUE,Color.RED,Color.GREEN,Color.BLACK,Color.CYAN,Color.DARK_GRAY,Color.LIGHT_GRAY,Color.MAGENTA,Color.ORANGE,Color.PINK,Color.WHITE,Color.YELLOW};

    ArrayList<Ball> balls = new ArrayList<>();


    public MyPanel(){
       setBackground(Color.GREEN);
       for(int i = 0; i < 20; i++){
           balls.add(new Ball((int)Math.random()*1200,  (int)Math.random()*600, (Math.random()*9) + 1,(Math.random()*9) + 1,(int)(Math.random()*100) + 10,colors[(int)Math.random()*13]));
       }



    }

   @Override
   public void paintComponent(Graphics g) {
        super.paintComponent(g);
//       g.setColor(Color.RED);
//       g.fillOval(x,y,100,100);
       for(int i = 0; i>20; i++){

       }
       balls.get(0).paint(g);
       balls.get(0).move(g);
       //delay
       try{
           Thread.sleep(30);
       }catch(InterruptedException e){
           System.out.println(e);
       }

//if(y > getWidth() - 130) {
//    ySpeed *= -1;
//    cy1 = true;
//    xSpeed*= 1.01;
//            ySpeed*= 1.01;
//}
//       if(y < 0) {
//           ySpeed *= -1;
//           cy2 = true;
//           xSpeed*= 1.01;
//           ySpeed*= 1.01;
//       }
//       if(x > getWidth()-100) {
//           xSpeed *= -1;
//           cx1 = true;
//           xSpeed*= 1.01;
//           ySpeed*= 1.01;
//       }
//       if(x < 0) {
//           xSpeed *= -1;
//           cx2 = true;
//           xSpeed*= 1.01;
//           ySpeed*= 1.01;
//       }
//
//       if(cy1 && cx1){
//g.drawString("CORNER", cornerpos, cornerpos);
//cornerpos+=10;
//       }
//       if(cy2 && cx1){
//           g.drawString("CORNER", cornerpos, cornerpos);
//           cornerpos+=10;
//       }
//       if(cy1 && cx2){
//           g.drawString("CORNER", cornerpos, cornerpos);
//           cornerpos+=10;
//       }
//       if(cy2 && cx2){
//           g.drawString("CORNER", cornerpos, cornerpos);
//           cornerpos+=10;
//       }
//
//       cx1 = false;
//       cy1 = false;
//       cx2 = false;
//       cy2 = false;

//calls paint component
repaint();

   }


}
