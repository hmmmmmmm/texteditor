//package editor;
//
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.*;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//
//public class LoadButton extends JButton implements ActionListener {
//    private final JTextField filenameField;
//    private final JTextArea textArea;
//
//    LoadButton(final JTextField textField, final JTextArea textArea){
//        super();
//        this.filenameField = textField;
//        this.textArea = textArea;
//        this.addActionListener(this);
//    }
//
//    public void actionPerformed(ActionEvent load){
//        try {
//            textArea.setText(new String(Files.readAllBytes(Paths.get(filenameField.getText()))));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
