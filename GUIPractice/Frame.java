package Framer;

import java.awt.FlowLayout;

// imports that contribues to action events such as mouse clicks.
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// imports that contributes to creating a frame/window.
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;


// class Frame is a subclass of JFrame that also implements the ActionListener interface
class Frame extends JFrame implements ActionListener {

// window variables 
    JTextField textfield = new JTextField(5);
    JButton button = new JButton("Click");
    JLabel labeler = new JLabel("Word");


// creating a frame with a button, label, text field
public Frame() {

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    add(textfield);
    add(button);
    add(labeler);
    
    // addActionListener responds to a mouse click.
    button.addActionListener(this);
    pack();
    
    // shows frame
    setVisible(true);

}

// a part of the ActionListener interface. Needs this method and it's body to respond to the mouse click on the button.
public void actionPerformed(ActionEvent e) {

    String textFieldText = textfield.getText();
    
    // grays out the button after it was been clicked.
    button.setEnabled(false);
    // grays out text field after user inputs
    textfield.setEnabled(false);
    
    // sets text of label to corresponding word user inputted.
    labeler.setText(textFieldText);


}



}
