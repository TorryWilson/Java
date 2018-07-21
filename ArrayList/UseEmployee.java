// Step through a list of employees. Find each employee whose performance evaluation scored 3 or higher. Give each such employee a $100 bonus and determine the total amount of money you'll pay in bonuses.

package ArrayList;

import java.util.ArrayList;


public class UseEmployee {

    public static void main(String [] args) {

        // Create new arrayList with Employee objects
        ArrayList<Employee> team = new ArrayList<Employee>();

        // method call to add objects to arrayList
        fillList(team);

        // variable that holds bonus amount;
        double totalBonus = 0;

        // enhanced for loop that walks through arrayList
        for(Employee group : team) {

            // if statement that compares each performance value in arrayList and does computation.
            if(group.getPerformance() >= 3) {

                totalBonus = totalBonus + 100;
            }


        } System.out.println(totalBonus);
    }

    // method that fills arrayList

    static void fillList(ArrayList<Employee> team) {

        team.add(new Employee("Taylor", "4", 4, 20));
        team.add(new Employee("Torry", "15", 3, 30));
        team.add(new Employee("Christina", "3", 1, 15));
        team.add(new Employee("Jim", "400", 4, 35));

    }
}
