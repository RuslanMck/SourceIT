import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface extends JPanel {

    int IdxFst;
    int IdxSec;
    int dist;
    private JTextField output = new JTextField("Distance");
    String[] stationsList = {"Paris", "Lausanne", "Milan", "Venice", "Belgrad", "Sofia", "Istanbul"};
    int[] distance = {498, 337, 269, 789, 394, 550};


    public Interface() {
        setLayout(null);

        createLabel("Welcome", 35,10,200,25,true,0);
        createLabel("From:", 25,50,100,25,true,0);
        createLabel("To:", 25,100,100,25,true,0);
        createButton("Search", 25,150,100,25);
        createOutput(150,150,100,25,true,true,0);

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
    }

    public void createOutput (int x, int y, int w, int h, boolean opaque, boolean editable, int alignment){
        output.setBounds(x,y,w,h);
        output.setOpaque(true);
        output.setEditable(false);
        output.setHorizontalAlignment(0);
        add(output);
    }

    public void createButton (String name, int x, int y, int w, int h) {
        JButton button = new JButton(name);
        button.setBounds(x,y,w,h);
        add(button);
        button.addActionListener(new buttonListenet());
    }

    public void createLabel (String name, int x, int y, int w, int h, boolean opaque, int alignment){
        JLabel Label = new JLabel(name);
        Label.setBounds(x, y, w, h);
        Label.setOpaque(true);
        Label.setHorizontalAlignment(0);
        add(Label);
    }

    public class buttonListenet implements ActionListener {

        public void actionPerformed(ActionEvent event) {
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
