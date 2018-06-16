/* Create a Student class with a name, an ID number, a GPA, and a major area of study.
The student's name is a String. The student's ID number is an int value. The GPA is a double value between 0.0 - 4.0
The Major is an enum type, with values such as COMPUTER_SCIENCE, MATHEMATICS, LITERATURE, PHYSICS, and HISTORY

Every student has a name and ID number, but a brand new student might not have a GPA or major. Create CONSTRUCTORS
with and without GPA and Major parameters.

*/


package School;

public class Student {

    private String name;
    private int ID;
    private double GPA;
    private Enum Major;


    public Student() {
        this.name = name;
        this.ID = ID;


    }

    public Student(String name, int ID) {

        this.name = name;
        this.ID = ID;

    }

    public Student(String name, int ID, double GPA, Enum Major) {

        this.name = name;
        this.ID = ID;
        this.GPA = GPA;
        this.Major = Major;
    }

    public Enum getMajor() {
        return Major;
    }

    public void setMajor(Enum major) {
        Major = major;
    }

    public String getName() {
        return name;
    }

    // makes sure user enters something
    public void setName(String name) {

        if (!name.equals(null)) {
            this.name = name; }

        }

        public int getID () {
            return ID;
        }

        // make sures ID # is greater than 0
        public void setID ( int ID){

            if (ID > 0) {
                this.ID = ID;
            }

        }

        public double getGPA () {
            return GPA;
        }

        public void setGPA ( double GPA){

        // make sures GPA is between 0 - 4.0

            if (GPA >= 0 && GPA <= 4.0) {

                this.GPA = GPA;
            } else {
                this.GPA = 10000;
            }
        }

        public void Display () {

            System.out.println(getName() + ", ID #" + getID() + ", is a " + getMajor() + " major and has a " + getGPA() + " GPA!");

        }
    }

