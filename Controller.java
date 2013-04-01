import javax.swing.SwingWorker;

@SuppressWarnings("rawtypes")
public class Controller extends SwingWorker {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        this.execute();
    }

    @Override
    protected Object doInBackground() throws Exception {
        for (int i = 0; i < 600; i++) {
            model.modify(i < 300 ? 1 : -1);
            try { Thread.sleep(10); } catch (InterruptedException ignore) {};
            view.repaint();
        }
        return null;
    }
}
