class Main {
    public static void main(String[] args) {
        Thread t1 = Thread .currentThread();
        t1.setName("Main Thread");
        System.out.println("Current Thread: " + t1);
    }
}