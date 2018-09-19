import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface extends JPanel {

    int IdxFst;
    int IdxSec;
    int dist;
    private JTextField output = new JTextField("Distance");

    public Interface() {
        setLayout(null);

        JLabel welcome = new JLabel("Select destination points");
        welcome.setBounds(35, 10, 200, 25);
        welcome.setHorizontalAlignment(0);
        welcome.setOpaque(true);
        add(welcome);

        JLabel firstStationLabel = new JLabel("From: ");
        firstStationLabel.setBounds(25, 50, 100, 25);
        firstStationLabel.setHorizontalAlignment(0);
        firstStationLabel.setOpaque(true);
        add(firstStationLabel);

        String[] stationsList = {"Paris", "Lausanne", "Milan", "Venice", "Belgrad", "Sofia", "Istanbul"};

        JComboBox CB1 = new JComboBox(stationsList);
        CB1.setEditable(false);
        CB1.setBounds(150, 50, 100, 25);
        CB1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox<String> combo = (JComboBox<String>) e.getSource();
                IdxFst = combo.getSelectedIndex();
            }
        });
        add(CB1);

        JLabel secStationLabel = new JLabel("To: ");
        secStationLabel.setBounds(25, 100, 100, 25);
        secStationLabel.setOpaque(true);
        secStationLabel.setHorizontalAlignment(0);
        add(secStationLabel);

        JComboBox CB2 = new JComboBox(stationsList);
        CB2.setEditable(false);
        CB2.setBounds(150, 100, 100, 25);
        CB2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox<String> combo = (JComboBox<String>) e.getSource();
                IdxSec = combo.getSelectedIndex();
            }
        });
        add(CB2);

        JButton button = new JButton("Search");
        button.setBounds(25, 150, 100, 25);
        add(button);
        button.addActionListener(new buttonListenet());

        output.setBounds(150, 150, 100, 25);
        output.setOpaque(true);
        output.setEditable(false);
        output.setHorizontalAlignment(0);
        add(output);
    }

    public class buttonListenet implements ActionListener {
        public void actionPerformed(ActionEvent event) {

            int[] distance = {498, 337, 269, 789, 394, 550};

            if (IdxFst > IdxSec) {
                IdxFst = IdxFst + IdxSec;
                IdxSec = IdxFst - IdxSec;
                IdxFst = IdxFst - IdxSec;
            }
            for (; IdxFst < IdxSec; IdxFst++) {
                dist += distance[IdxFst];
            }

            output.setText(String.valueOf(dist + " kilometers"));
            IdxFst = 0;
            dist = 0;
        }
    }
}
