package editor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class SaveAction implements ActionListener {
    private final JTextField filenameField;
    private final JTextArea inputArea;

    public SaveAction(JTextField filenameField, JTextArea inputArea) {
        this.filenameField = filenameField;
        this.inputArea = inputArea;
    }

    @Override
    public void actionPerformed(ActionEvent save) {
        File file = new File(filenameField.getText());
        String data = inputArea.getText();
        try (OutputStream fos = new FileOutputStream(file)) {
            fos.write(data.getBytes(), 0, data.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
