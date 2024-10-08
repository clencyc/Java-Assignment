abstract class Bike {
    abstract void run();
}

class Honda extends Bike {
    public void run() {
        System.out.println("Honda is running");
    }
}


class Main{
public static void main(String[] args) {
    Honda honda = new Honda();
    honda.run();
}
}