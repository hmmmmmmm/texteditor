package editor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisposeAction implements ActionListener {
    JFrame textEditor;

    DisposeAction(JFrame textEditor){
        this.textEditor = textEditor;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        textEditor.dispose();
    }
}
