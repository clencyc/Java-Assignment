// Create a class “Person” with fields “name” and “age” and a method “display()” that prints the name and
// age of the person.

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String display() {
        return "Name:" + name + ", Age:" + age;
    }


}