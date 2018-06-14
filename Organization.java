public class Organization {

    String name;
    double revenue;
    boolean profit;
// displays information about the organization
    public void display() {
        String kind;
        if (profit == true) {
            kind = "profit";
        }

        else kind = "non-profit";
        System.out.println(name + " is a " + kind + " organization that has" + " " + revenue + " dollars in revenue" );
    }

    // adds a method to class that computes the amount of tax an organization pays.
    // a profit-making organization pays 10 percent in taxes while a non-profit pays 2.
    public double taxPaying() {
        double tax;
        if (profit == true) {
            tax = revenue / 10.00;
        }

            else
                tax = revenue / 2.00;
        return tax;
    }

}
