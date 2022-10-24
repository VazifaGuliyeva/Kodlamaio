public class Student extends User {

    private String studentNumber;
    private String lesson;
    private String educationLevel;


    public Student(String name, String address, String phoneNumber, String email, String password,String studentNumber,String lesson,String educationLevel) {
        super(name, address, phoneNumber, email, password);
        this.studentNumber=studentNumber;
        this.lesson=lesson;
        this.educationLevel=educationLevel;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }
}
