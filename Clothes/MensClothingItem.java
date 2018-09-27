package Clothes;

import Clothes.Items;

public class MensClothingItem {

    // members of this class consists of an enum and string value
    private Items item;
    private String name;


    // constructor, only way an item can be created.
    public MensClothingItem(Items item, String name) {

        this.item = item;
        this.name = name;

    }

    // setters and getters
    public Items getItem() {
        return item;
    }

    public void setItem(Items item) {
        this.item = item;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
