// Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate
// the area and perimeter of the rectangle.

class Rectangle {
    double width;
    double height;

    // Constructors to initialize the attributes,
    // they allow you to set initial values for
    // the object's attributes and perform any setup required
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Getters to get the attributes
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Setters to set the attributes
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Calculate the area of the rectangle
    public double calculateArea() {
        return width * height;
    }

    // Calculate the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}
