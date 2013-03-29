import javax.swing.SwingUtilities;

public class Main implements Runnable {
    public static void main(String[] args) {
        // queue up the Main Runnable on the EDT
        SwingUtilities.invokeLater(new Main());
    }
    
    /**
     * Run on the EDT, creating model, view, and controller.
     */
    public void run() {
        Model model = new Model(0, 0, 0, 0);
        View view = new View(model);
        new Controller(model, view);
    }
}
