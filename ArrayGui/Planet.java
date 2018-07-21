package Solar;

public class Planet {

   private Enum name;
   private Enum type;
   private double lifepercentage;

    public Planet(Enum name, Enum type, double lifepercentage){

        this.name = name;
        this.type = type;
        this.lifepercentage = lifepercentage;
    }

    public Enum getName() {
        return name;
    }

    public void setName(Enum name) {
        this.name = name;
    }

    public Enum getType() {
        return type;
    }

    public void setType(Enum type) {
        this.type = type;
    }

    public double getLifepercentage() {
        return lifepercentage;
    }

    public void setLifepercentage(double lifepercentage) {
        this.lifepercentage = lifepercentage;
    }
}
