public interface A {
    void display();
    void show();
}

public interface B {
    void display1();
    void show1();
}

class C implements A, B {
    public void display() {
        System.out.println("A display");
    }
    public void show() {
        System.out.println("A show");
    }
    public void display1() {
        System.out.println("B display");
    }
    public void show1() {
        System.out.println("B Show");
    }

    public static void main(String[] args) {
        C obj = new C();
        obj.display();
        obj.show();
        obj.display1();
        obj.show1();
     }  
}
