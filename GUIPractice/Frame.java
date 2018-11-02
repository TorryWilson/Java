package Framer;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

class Frame extends JFrame implements ActionListener {

    JTextField textfield = new JTextField(5);
    JButton button = new JButton("Click");
    JLabel labeler = new JLabel("Word");



public Frame() {

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    add(textfield);
    add(button);
    add(labeler);
    button.addActionListener(this);
    pack();
    setVisible(true);

}

public void actionPerformed(ActionEvent e) {

    String textFieldText = textfield.getText();
    button.setEnabled(false);
    textfield.setEnabled(false);
    labeler.setText(textFieldText);


}



}
