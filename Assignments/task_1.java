// Write a Java program to create a class called "Person" with a name and age attribute. Create two
// instances of the "Person" class, set their attributes using the constructor, and print their name and
// age.

class Person {
    String name;
    int age;

    // Constructors to initialize the attributes,
    // they allow you to set initial values for
    // the object's attributes and perform any setup required
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters to get the attributes
    public String getNAme() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
// this is the main function
public class task_1 {
    public static void main(String[] args) {
        // create two instances of person class
        Person person1 = new Person("Alice", 35);
        Person person2 = new Person("Bob", 25);

        System.out.println("Name: " + person1.getNAme() + ", Age: " + person1.getAge());
        System.out.println("Name: " + person2.getNAme() + ", Age: " + person2.getAge());

    }
}