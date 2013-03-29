/**
 * Implement a very simple model: a single oval with given position, width, 
 * and height.  Allow modification by a single delta value.
 */
public class Model {
    private int x;
    private int y;
    private int width;
    private int height;
    
    Model(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public int getWidth() {
        return width;
    }
    
    public int getHeight() {
        return height;
    }

    public void modify(int delta) {
        x += delta;
        y += delta;
        width += delta;
        height += delta;
    }
}
