public class Color {
    private String color;

    //getter method
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
class Vehicle {
    public static void main(String[] args) {
        Color v1 = new Color();
        v1.setColor("Red");
        System.out.println(v1.getColor());
    }
}