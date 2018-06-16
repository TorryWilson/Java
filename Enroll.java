package School;

public class Enroll {

    public static void main(String [] arg ) {

        // Creates a student using two parameter constructor of Student class.
        Student classmate = new Student("Torry Wilson", 10);

        classmate.setGPA(3.2);
        classmate.setMajor(Major.HISTORY);

        // Creates a student using the constructor with no parameters of Student class.
        Student classmate2 = new Student();

        classmate2.setName("Taylor Joseph");
        classmate2.setID(20);
        classmate2.setGPA(3.4);
        classmate2.setMajor(Major.PHYSICS);

        // Creates a student using the constructor with all parameters in Student class.
        Student classmate3 = new Student("Nyya Duhon", 15, 2.4, Major.COMPUTER_SCIENCE);

        classmate.Display();
        classmate2.Display();
        classmate3.Display();



    }
}
