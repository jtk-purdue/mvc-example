import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class View extends Canvas {
    Model model;

    public View(Model model) {
        this.model = model;
        
        JFrame frame = new JFrame("MVC Example");
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(640, 480);
        frame.add(this);
        frame.setVisible(true);
    }
    
    @Override
    public void paint(Graphics g) {
        
        g.setColor(Color.RED);
        g.fillOval(model.getX(), model.getY(), model.getWidth(), model.getHeight());
    }    
}
