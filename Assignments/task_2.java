// Write a Java program to create a class called "Dog" with a name and breed attribute. Create two
// instances of the "Dog" class, set their attributes using the constructor and modify the attributes using
// the setter methods and print the updated values.

class Dog {
    String name;
    String breed;

    // Constructors to initialize the attributes,
    // they allow you to set initial values for
    // the object's attributes and perform any setup required
    Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Getters to get the attributes
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    // Setters to set the attributes
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Bosco", "Chiwawa");

        System.out.println("Name:" + dog1.getName() + "Breed:" + dog1.getBreed());

        dog1.setName("Helios");
        dog1.setBreed("Husky");
        System.out.println("Name:" + dog1.getName() + " Breed:" + dog1.getBreed());
    }
}

