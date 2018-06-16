package Company;

public class Creator {

    public static void main(String [] args) {

        ProfitMakingOrganization moneyOrg = new ProfitMakingOrganization();

        moneyOrg.setName("LA CAT");

        moneyOrg.Display();

        NonProfitOrganization noMoneyorg = new NonProfitOrganization();

        noMoneyorg.setName("Red Cross");

        noMoneyorg.Display();
    }
}
