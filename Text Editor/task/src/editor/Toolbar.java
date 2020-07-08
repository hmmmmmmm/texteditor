package editor;

import javax.swing.*;
import java.awt.*;

public class Toolbar extends JPanel {
    private JTextArea textArea;
    JTextField filename = new JTextField();
    SaveButton save = new SaveButton(filename, textArea);
    LoadButton load = new LoadButton(filename, textArea);

    public Toolbar(JTextArea textArea){
        this.textArea = textArea;
        setLayout(new FlowLayout());

        filename.setName("FilenameField");
        filename.setPreferredSize(new Dimension(550, 24));
        save.setName("SaveButton");
        save.setText("Save");
        save.setPreferredSize(new Dimension(80, 24));
        load.setName("LoadButton");
        load.setPreferredSize(new Dimension(80, 24));
        load.setText("Load");

        add(filename);
        add(Box.createHorizontalGlue());
        add(save);
        add(Box.createRigidArea(new Dimension(10, 0)));
        add(load);
    }
}
