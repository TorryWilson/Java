package Clothes;

import Clothes.Items;

public class MensClothingItem {

    private Items item;
    private String name;


    public MensClothingItem(Items item, String name) {

        this.item = item;
        this.name = name;

    }

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
