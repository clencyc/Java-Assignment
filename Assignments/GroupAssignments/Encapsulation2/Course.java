package Encapsulation2;

class Course{
    //The class uses private attributes which restricts direct access to the data
    private String CourseName;
    private String  CourseUnit;
    private String Student;
    private int Points;
    
    //To access and modify the attribute we have implemented getter and setter methods
    //which ensures controlled access through public methods
    public String getCourseName(){
        return CourseName;
    }
    public void  setCourseName(String CourseName){
        this.CourseName = CourseName;
    }
    public  String getCourseUnit(){
        return  CourseUnit;
    }
    public void setCourseUnit(String CourseUnit){
        this.CourseUnit = CourseUnit;
    }
    public   String getStudent(){
        return Student;
    }
    public  void  setStudent(String Student){
        this.Student = Student;
    }
    public int  getPoint() {
    	return Points;
    }
    public void setPoints(int Points) {
    	this.Points = Points;
    }
    //this method prints the course details
    public  void displayCourse(){
        System.out.println("Course Name: " + CourseName);
        System.out.println("The course Unit is:" + CourseUnit);
        System.out.println("Student name is:" + Student);
        System.out.println("The Student's Points are:" + Points);
    }
}
    
//in this method, we've created an instance of a course class then called the display method
