/**
 * Implement a simple controller that updates the model and repaints the view.
 */

import javax.swing.SwingWorker;

public class Controller extends SwingWorker {
    Model model;
    View view;
    
    Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        this.execute();  // start the doInBackground method
    }
    
    /**
     * doInBackground runs in its own (non-EDT) thread.  Updates model, 
     * then tells view to repaint, which calls paint method on the EDT.
     */
    @Override
    public Void doInBackground() {
        for (int i = 0; i < 600; i++) {
            model.modify(i < 300 ? 1 : -1);
            try { Thread.sleep(10); } catch (InterruptedException ignore) {};
            view.repaint();
        }
        return null;
    }
}
