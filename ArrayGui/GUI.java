package Solar;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;



public class GUI extends JFrame {

    public GUI() throws IOException {

        // creates an array of 8 planet objects
        Planet planets [] = new Planet[8];

        // 8 planet objects
        planets[0] = new Planet(Name.Mercury, Solar.Type.Terrestial, 10);
        planets[1] = new Planet(Name.Venus, Solar.Type.Terrestial, 30);
        planets[2] = new Planet(Name.Earth, Solar.Type.Terrestial, 100);
        planets[3] = new Planet(Name.Mars, Solar.Type.Terrestial, 40);
        planets[4] = new Planet(Name.Jupiter, Solar.Type.GasGiants, 10);
        planets[5] = new Planet(Name.Saturn, Solar.Type.GasGiants, 5);
        planets[6] = new Planet(Name.Uranus, Solar.Type.IceGiants, 3);
        planets[7] = new Planet(Name.Neptune, Solar.Type.IceGiants, 0);

        // for loop that takes the 8 planet objects and sends each planet object to the addPlanetInfo method to display.
        for(int i = 0; i <= 7; i++) {


        addPlanetInfo(planets[i]); }
        
        // setting properties of the window 
        setTitle("Planets of our of the Milky Way");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(9,3,20,4));
        pack();
        setVisible(true);
        //Scanner keyboard = new Scanner(System.in);


    }
    // method that adds information to the window such as planet name, type, and life %
    void addPlanetInfo(Planet planet){
      add(new JLabel(String.valueOf(planet.getName())));
      add(new JLabel(String.valueOf(planet.getType())));
      add(new JLabel(String.valueOf(planet.getLifepercentage() + "%")));
}}

