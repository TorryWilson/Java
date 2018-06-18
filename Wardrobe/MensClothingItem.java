package Clothes;

public class MensClothingItem {

     private Types clothing;
     private String name;

    public Types getClothing() {
        return clothing;
    }

    public void setClothing(Types clothing) {
        this.clothing = clothing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MensClothingItem(Types clothing, String name) {

        this.name = name;
        this.clothing = clothing;

    }
}

