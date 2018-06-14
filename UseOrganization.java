// Uses organization.java
// creates an organization and displays information about it.

public class UseOrganization {

    public static void main(String args[]) {

       Organization myOrganization = new Organization();
       myOrganization.name = "LA Cat";
       myOrganization.profit = true;
       myOrganization.revenue = 1000000;

       myOrganization.display();
        
    }
    
       
}
