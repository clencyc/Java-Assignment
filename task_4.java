// Write a Java program to create a class called "Circle" with a radius attribute. You can access and
// modify this attribute. Calculate the area and circumference of the circle.

class Circle {
    double radius;

    // Constructors to initialize the attributes,
    // they allow you to set initial values for
    // the object's attributes and perform any setup required
    Circle(double radius) {
        this.radius = radius;
    }

    // Getters to get the attributes
    public double getRadius() {
        return radius;
    }

    // Setters to set the attributes
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Calculate the circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}