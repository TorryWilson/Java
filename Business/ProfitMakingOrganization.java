package Company;

public class ProfitMakingOrganization extends Organization {

    private int tax = 10;

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public void Display() {

        System.out.println(getName() + ", a profit organization, pays " + getTax() + " percent in taxes");
    }
}
