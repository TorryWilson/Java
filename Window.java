public class Window {

    public static void main(String[] args) {

        DummiesFrame frame = new DummiesFrame("About your organization");
        frame.addRow("Name of Organization");
        frame.addRow("Organization's Revenue");
        frame.addRow("Is it Profit? YES/NO");
        frame.go();

    }

    public static String calculate (String name, double revenue, String profit) {

        Organization newOrganization = new Organization();

        newOrganization.setName(name);
        newOrganization.setRevenue(revenue);
        newOrganization.setProfit(profit);


        return "Your company " + newOrganization.getName() + " has " + newOrganization.getRevenue() + " in revenue and is a " + newOrganization.isProfit() + " organization";


    }
}
