public class Student extends Person {
    private  String studentId;
    public Student(String name,String age,String studentId) {
        super(name,age);
        this.studentId = studentId;
    }
    public void display() {
      //  System.out.printf("name"+this.getFirstName());
    }
}
