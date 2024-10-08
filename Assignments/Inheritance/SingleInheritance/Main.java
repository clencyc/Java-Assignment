// this is the main file

class Main {
    public static void main(String[] args) {
        // create two instances of person class
        Person person1 = new Person("Alice", 35);

// 'getName' is a method in the Person class that returns the name of the person
        // person1.display();

        System.out.println(person1.display());
        // System.out.println(person2.display());

        // create an instance of the employee class
        Employee employee = new Employee("Charlie", 30, 50000);
        System.out.println(employee.display());
    }
}