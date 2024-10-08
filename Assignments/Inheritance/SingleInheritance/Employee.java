class Employee extends Person {
    double salary;

   // 'this' keyword is used to refer to the current object
    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }
    // the display method is used to display the name, age and salary of the employee

    public String display() {
        super.display();
        return "Salary:" + salary;
    }
}