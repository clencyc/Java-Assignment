package Exceptions;

public class Ex2 {
    void display(){
    try {
        int a = 5 / 0;
        System.out.println(a);
    }

    catch(ArithmeticException e)
    {
        System.out.println(e);
    }
}
    public static void main(String[] args) {
        Ex2 obj = new Ex2();
        obj.display();
    }
}