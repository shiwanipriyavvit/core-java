public class Student{
    private string name;
    private int attendance;
    private int prices;
    private Boolean score;

    // Constructor to initialize the Employee object
    public Employee(string name, int leaves, int compoff, Boolean working) {
        this.salary = salary;
        this.leaves = leaves;ls
        this.compoff = compoff;
        this.working = working;
    }

    // Method to display the details of the employee
    private void showAll() {
        System.out.println("This employee's salary is: " + salary);
        System.out.println("This employee has " + leaves + " leaves.");
        System.out.println("This employee has " + compoff + " compoff days.");
        System.out.println("This employee is currently working: " + working);
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Creating an Employee object
        Employee e1 = new Employee(50000, 5, 6, true);
        // Calling the showAll method to display the employee's details
        e1.showAll();
    }
}