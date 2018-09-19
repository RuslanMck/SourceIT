import javax.swing.*;

public class StartUI {

    private JFrame window;

    public StartUI() {
        window = new JFrame("Express");
        window.setSize(290, 225);
        window.add(new Interface());
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StartUI();
            }
        });

    }
}
