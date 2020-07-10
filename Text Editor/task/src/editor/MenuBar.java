package editor;

import javax.swing.*;
import java.awt.*;

public class MenuBar extends JMenuBar {
    JMenu file;
    JMenuItem load, save, exit;
    private JTextArea textArea;
    private JTextField filename;
    JFrame textEditor;

    MenuBar(JTextField filename, JTextArea textArea, JFrame textEditor) {
        this.filename = filename;
        this.textArea = textArea;
        this.textEditor = textEditor;
        this.setPreferredSize(new Dimension(800,20));

        file = new JMenu("File");
        load = new JMenuItem("Load");
        save = new JMenuItem("Save");
        exit = new JMenuItem("Exit");

        file.setName("MenuFile");
        load.setName("MenuLoad");
        save.setName("MenuSave");
        exit.setName("MenuExit");

        load.addActionListener(new LoadAction(filename, textArea));
        save.addActionListener(new SaveAction(filename, textArea));
        exit.addActionListener(new DisposeAction(textEditor));

        file.add(load);
        file.add(save);
        file.add(exit);
        this.add(file);
        this.add(Box.createHorizontalGlue());
    }
}
