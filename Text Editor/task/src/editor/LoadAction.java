package editor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LoadAction implements ActionListener {
    private final JTextField filenameField;
    private final JTextArea inputArea;

    public LoadAction(JTextField filenameField, JTextArea inputArea) {
        this.filenameField = filenameField;
        this.inputArea = inputArea;
    }

    @Override
    public void actionPerformed(ActionEvent load) {
        char[] buffer = null;
        File file = new File(filenameField.getText());
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (buffer != null) {
            inputArea.setText(new String(buffer));
        } else {
            inputArea.setText("");
        }
    }
}
