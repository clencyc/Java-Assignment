package Exceptions;

public class Ex3 {
    void display() {
        try {
            int a = 5 / 0;
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
        //int a = 5 / 0;
        System.out.println("Exception handled");
    }
    public static void main(String[] args) {

        Ex3 obj = new Ex3();
        obj.display();
        // null is used 
        String S = null;
        System.out.println(S.length());

        String W = "abc";
        int i = Integer.parseInt(W);
        }
}
