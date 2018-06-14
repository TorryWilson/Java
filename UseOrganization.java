public class UseOrganization {

    public static void main(String args[]) {

       Organization myOrganization = new Organization();
       myOrganization.name = "LA Cat";
       myOrganization.profit = true;
       myOrganization.revenue = 1000000;
       Organization yourOrganization = new Organization();
       yourOrganization.name = "Blue Shield";
       yourOrganization.profit = false;
       yourOrganization.revenue = 5000;
       myOrganization.display();
       yourOrganization.display();
       System.out.println(yourOrganization.taxPaying());
       System.out.println(myOrganization.taxPaying());
    }
}
