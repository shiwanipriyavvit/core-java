public class Student {

    private String name;
    private int attendance; // assuming attendance is the number of days attended
    private int prizes;
    private Boolean goodStudent;

    // Constructor to initialize the Student object
    public Student(String name, int attendance, int prizes, Boolean goodStudent) {
        this.name = name;
        this.attendance = attendance;
        this.prizes = prizes;
        this.goodStudent = goodStudent;
    }

    // Method to display the details of the student
    private void showAll() {
        System.out.println("This student's name is: " + name);
        System.out.println("This student has " + attendance + "% attendance.");
        System.out.println("This student has " + prizes + " prizes.");
        System.out.println("This student is a good student: " + goodStudent);
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Creating a Student object
        Student e1 = new Student("Avyukt", 70, 6, true);
        // Calling the showAll method to display the student's details
        e1.showAll();
    }
}

