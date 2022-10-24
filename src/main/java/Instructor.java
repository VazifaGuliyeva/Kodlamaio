public class Instructor extends User{
    private double salary;
    private String course;
    private Student[] students;

    public Instructor(String name, String address, String phoneNumber, String email, String password,double salary,String course,Student[] students) {
        super(name, address, phoneNumber, email, password);

        this.salary=salary;
        this.course=course;
        this.students=students;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
