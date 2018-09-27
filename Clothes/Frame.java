package Clothes;

import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.io.IOException;


public class Frame extends JFrame {

    public Frame() throws IOException {
        
        // creates 6 MensClothingItems 
        // feeds this object to the addToFrame method 

        MensClothingItem mensClothingItem1 = new MensClothingItem(Items.SHIRTS, "Long");
        addToFrame(mensClothingItem1);

        MensClothingItem mensClothingItem2 = new MensClothingItem(Items.PANTS, "Chino");
        addToFrame(mensClothingItem2);

        MensClothingItem mensClothingItem3 = new MensClothingItem(Items.JACKETS, "Fleece");
        addToFrame(mensClothingItem3);

        MensClothingItem mensClothingItem4 = new MensClothingItem(Items.OVERCOATS, "Wool");
        addToFrame(mensClothingItem4);

        MensClothingItem mensClothingItem5 = new MensClothingItem(Items.NECKTIES, "Wide");
        addToFrame(mensClothingItem5);

        MensClothingItem mensClothingItem6 = new MensClothingItem(Items.SHOES, "Oxford");
        addToFrame(mensClothingItem6);

        // sets window settings such as title of window, rows, etc.
        setTitle("Outfit");
        setLayout(new GridLayout(6, 2, 20, 3));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);

    }

   void addToFrame(MensClothingItem mensClothingItem) {

        add(new JLabel("  " + mensClothingItem.getName()));
        add(new JLabel("  " + mensClothingItem.getItem()));
   }
}
