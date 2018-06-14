public class UseOrganization {

    public static void main(String args[]) {
        // creates an organization
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
        
        
       // prints how much taxes does each organization pay. 
       System.out.printf("$%3.2f\n", yourOrganization.taxPaying());
       System.out.printf("$%3.2f\n", myOrganization.taxPaying());
    }
}
