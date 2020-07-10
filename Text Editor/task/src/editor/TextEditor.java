package editor;

import javax.swing.*;
import java.awt.*;

public class TextEditor extends JFrame {
    public TextEditor() {
        setName("TextEditor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setTitle("Text Editor");
        setVisible(true);

        JTextArea textArea = new JTextArea(30, 80);
        textArea.setName("TextArea");
        JScrollPane scroll = new JScrollPane(textArea);
        scroll.setPreferredSize(new Dimension(750, 500));
        scroll.setName("ScrollPane");
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        Toolbar toolbar = new Toolbar(textArea);
        MenuBar menuBar = new MenuBar(toolbar.filename, textArea, this);

        add(scroll, BorderLayout.CENTER);
        JPanel topMenu = new JPanel();
        topMenu.setLayout(new BoxLayout(topMenu, BoxLayout.Y_AXIS));
        topMenu.add(menuBar);
        topMenu.add(toolbar);
        add(topMenu, BorderLayout.NORTH);

        pack();
        setVisible(true);
    }
}
