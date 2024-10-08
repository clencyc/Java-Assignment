abstract class Dog {
    public void bark()
    {
        System.out.println("Bark");
    }
    public abstract void poop(); //<-- meant for abstraction 
}

class Chihuahua extends Dog {
    public void poop() {
        System.out.println("Dog pooped");
    }
}
class Main{
public static void main(String[] args) {
        Chihuahua c = new Chihuahua();
        c.bark();
        c.poop();
    }
}
