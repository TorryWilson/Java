package Company;

public class NonProfitOrganization extends Organization {

    private int tax = 2;

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public void Display() {

        System.out.println(getName() + ", a non-profit organization, pays " + getTax() + " percent in taxes");
    }
}
