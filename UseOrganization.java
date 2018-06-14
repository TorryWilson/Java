public class UseOrganization {

    public static void main(String args[]) {

       Organization myOrganization = new Organization();
       myOrganization.setName("LA Cat");
       myOrganization.setProfit(true);
       myOrganization.setRevenue(1000000);
       Organization yourOrganization = new Organization();
       yourOrganization.setName("Blue Shield");
       yourOrganization.setProfit(false);
       yourOrganization.setRevenue(5000);
       myOrganization.display();
       yourOrganization.display();
       System.out.printf("$%3.2f\n", yourOrganization.taxPaying());
       System.out.printf("$%3.2f\n", myOrganization.taxPaying());
    }
}
