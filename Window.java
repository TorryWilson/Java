// dummiesFrame and Organization.java is needed 
// GUI

public class Window {

    public static void main(String[] args) {
// creates a window instance titled About your organization
        DummiesFrame frame = new DummiesFrame("About your organization");
// 3 rows for users to enter information about organization
        frame.addRow("Name of Organization");
        frame.addRow("Organization's Revenue");
        frame.addRow("Is it Profit? YES/NO");
// opens up window
        frame.go();
    }

    public static String calculate (String name, double revenue, String profit) {

        Organization newOrganization = new Organization();
        newOrganization.setName(name);
        newOrganization.setRevenue(revenue);
        newOrganization.setProfit(profit);
        return "Your company " + newOrganization.getName() + " pays " + newOrganization.taxPaying() + " in taxes!";
    }
}

// Task: A window has text fields for an organization's name, annual revenue, and status (profit-making or non-profit-making). When the user clicks a button, the window displays the amount of tax the organization pays.
