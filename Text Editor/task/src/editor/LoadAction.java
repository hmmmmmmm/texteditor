package editor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LoadAction implements ActionListener {
    private final JTextField filenameField;
    private final JTextArea inputArea;

    public LoadAction(JTextField filenameField, JTextArea inputArea) {
        this.filenameField = filenameField;
        this.inputArea = inputArea;
    }

    @Override
    public void actionPerformed(ActionEvent load) {
        try {
            inputArea.setText(new String(Files.readAllBytes(Paths.get(filenameField.getText()))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
