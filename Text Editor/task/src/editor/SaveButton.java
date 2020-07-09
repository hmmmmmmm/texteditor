package editor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class SaveButton extends JButton implements ActionListener {
    private final JTextField filenameField;
    private final JTextArea textArea;

    SaveButton(final JTextField textField, final JTextArea textArea){
        super();
        this.filenameField = textField;
        this.textArea = textArea;

        this.addActionListener(this);
    }

    public void actionPerformed(ActionEvent save){
        File file = new File(filenameField.getText());
        BufferedWriter fout = null;
        try {
            fout = new BufferedWriter(new FileWriter(file));

            textArea.write(fout);
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
