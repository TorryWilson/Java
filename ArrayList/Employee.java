package ArrayList;

public class Employee {

    String name;
    int performance;
    String ID;
    double pay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPerformance() {
        return performance;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public Employee(String name, String ID, int performance, double pay){

        this.name = name;
        this.ID = ID;
        this.performance = performance;
        this.pay = pay;

    }


    // didnt use this yet but this will compute bonus with employees pay.
    double bonusDeterminer(int performance){

        double newPay = this.getPay();
        if(this.getPerformance() >= 3) {

            newPay = this.getPay() + 100;

        }
        return newPay;
    }

}
