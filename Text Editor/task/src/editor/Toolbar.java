package editor;

import javax.swing.*;
import java.awt.*;

public class Toolbar extends JPanel {
    private JTextArea textArea;
    JTextField filename = new JTextField();
    JButton save, load;

    public Toolbar(JTextArea textArea){
        this.textArea = textArea;
        this.save = new JButton("Save");
        this.load = new JButton("Load");
        setLayout(new FlowLayout());

        filename.setName("FilenameField");
        filename.setPreferredSize(new Dimension(550, 24));
        save.setName("SaveButton");
        save.setPreferredSize(new Dimension(80, 24));
        load.setName("LoadButton");
        load.setPreferredSize(new Dimension(80, 24));

        this.save.addActionListener(new SaveAction(filename, textArea));
        this.load.addActionListener(new LoadAction(filename, textArea));

        add(filename);
        add(Box.createHorizontalGlue());
        add(save);
        add(Box.createRigidArea(new Dimension(10, 0)));
        add(load);
    }
}
