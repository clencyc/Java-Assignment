class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();


        Mammal mammal = new Mammal();
        mammal.makeSound();
        mammal.giveBirth();
        
        Dog dog = new Dog();
        dog.makeSound();
        dog.giveBirth();


    }
}