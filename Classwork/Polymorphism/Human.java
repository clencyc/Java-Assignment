class Human {
    public void person() {
        System.out.println("Student");
    }
}
class Reader extends Human {
    public void person() {
        System.out.println("Reader");
    }
}

class Customer extends Human {
    public void person() {
        System.out.println("Customer");
    }
}

class Parent extends Human {
    public void person() {
        System.out.println("Parent");
    }
}

class Main{
public static void main(String[] args) {
    Reader T = new Reader();
    T.person();
 }
}
