/* A line of men's clothing features shirts, pants, jackets, overcoats, neckties, and shoes.
Create an enum to represent the six kinds of items. Then create a MensClothing Item class.
Each instance of the class has a kind (one of the six enum values), and a name (Such as Bow Tie).

Write a code to display a frame. The frame has six rows to describe one complete men's wardrobe */

package Clothes;
import javax.swing.*;
import java.awt.*;


public class UseMenClothingItem {

    public static void main(String [] args) {

        // creating 6 Clothing items

        MensClothingItem item = new MensClothingItem(Types.NECKTIES, "Bow Tie");
        MensClothingItem item2 = new MensClothingItem(Types.JACKETS, "Rain Jacket");
        MensClothingItem item3 = new MensClothingItem(Types.OVERCOATS, "Cashmere Coat");
        MensClothingItem item4 = new MensClothingItem(Types.PANTS, "Khaki Chinos");
        MensClothingItem item5 = new MensClothingItem(Types.SHOES, "Classic Oxford");
        MensClothingItem item6 = new MensClothingItem(Types.SHIRTS, "Blue Button Up");


        // creating a window

        JFrame frame = new JFrame();

        // setting title of window along with details about window.

        frame.setTitle("Article Of Clothing");
        frame.setLayout(new GridLayout(6,2,10,3));

        // adding each item to frame

        frame.add(new JLabel( item.getClothing() + "   " + item.getName()));
        frame.add(new JLabel( item2.getClothing() + "   " + item2.getName()));
        frame.add(new JLabel( item3.getClothing() + "   " + item3.getName()));
        frame.add(new JLabel( item4.getClothing() + "   " + item4.getName()));
        frame.add(new JLabel( item5.getClothing() + "   " + item5.getName()));
        frame.add(new JLabel( item6.getClothing() + "   " + item6.getName()));

        // program stops running when user exits.
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // size of window
        frame.setSize(400,300);

        // allows window to be seen.
        frame.setVisible(true);
    }
}
