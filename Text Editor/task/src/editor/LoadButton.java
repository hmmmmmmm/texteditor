package editor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class LoadButton extends JButton implements ActionListener {
    private final JTextField filenameField;
    private final JTextArea textArea;

    LoadButton(final JTextField textField, final JTextArea textArea){
        super();
        this.filenameField = textField;
        this.textArea = textArea;

        this.addActionListener(this);
    }

    public void actionPerformed(ActionEvent load){
        File file = new File(filenameField.toString());
        FileInputStream fin = null;
        byte[] inputFile = null;
        try {
            fin = new FileInputStream(file);

             inputFile = fin.readAllBytes();

             textArea.setText(inputFile.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fin != null) {
                    fin.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
