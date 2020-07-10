package editor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
        BufferedWriter fout = null;
        try {
            fout = new BufferedWriter(new FileWriter(file));

            inputArea.write(fout);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fout != null) {
                    fout.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
