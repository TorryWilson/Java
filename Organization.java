public class Organization {

    private String name;
    private double revenue;
    private String profit;
    public void setName(String name) {

        // make sure user enterd a name
        if (!name.equals("")) {
            this.name = name;
        }


    }

    public void setRevenue(double revenue) {

        // make sure revenue user entered is greater than 0
        if (revenue > 0) {
            this.revenue = revenue;
        }
    }

    public void setProfit(String profit) {

        String upperProfit = profit.toUpperCase();
        if (upperProfit.equals("YES")) {
            this.profit = "Profit";
        }

        if (upperProfit.equals("NO")) {
            this.profit = "Non-Profit";
        }
    }

    public String getName() {
        return name;
    }

    public double getRevenue() {
        return revenue;
    }

    public String isProfit() {
        return profit;
    }

}


    /* displays information about the organization
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
    //public double taxPaying() {
      //  double tax;
        //if (profit == true) {
          //  tax = revenue / 10.00;
        //}
        else
            tax = revenue / 2.00;
        return tax;
    }
} */
