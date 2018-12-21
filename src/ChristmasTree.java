/* 
   11/17/14
   JDK 1.7
   Draw a Christmas tree using JFrame
*/
import java.awt.*;
import javax.swing.*;
public class ChristmasTree extends JComponent {
JFrame frame = new JFrame("Christmas Tree");
    Container content = frame.getContentPane();
    public static void main(String[] args) {
       ChristmasTree drawing = new ChristmasTree();
       drawing.setUp();
    }
    public void setUp(){
        content.setBackground(new Color(131,168,237));
        content.add(this);
        frame.setSize(200,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    @Override
    public void paintComponent(Graphics g){
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Christmas Tree",20,40);
        g.setColor(new Color(26,122,48)); //foliage color
        g.drawLine(50,320,150,320); 
        g.drawLine(150,320,100,70); 
        g.drawLine(100,70,50,320); 
        g.setColor(new Color(140,98,58)); //trunk color
        g.fillRect(95,320,10,50); //tree trunk   
        g.drawOval(95,200,25,25);
        g.drawOval(75,250,20,10);
    }
    
    public void drawOrnament(Graphics g, Color color, int x, int y, int width, int height){
        g.setColor(color);
        g.drawOval(95,200,20,20);
    }
}