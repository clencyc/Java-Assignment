interface printable {
    void print();
}

interface showable {
    void show();
} 
class D implements printable, showable {
    public void print() {
        System.out.println("Print Hello");
    }
    public void show() {
        System.out.println("Show Hello");
    }
    public static void main(String[] args) {
        D a = new D();
        a.print();
        a.show();
    }
}