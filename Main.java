import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Model model = new Model(50, 50, 150, 100);
                View view = new View(model);
                new Controller(model, view);
            }
        });
    }
}
