public class StudentManager extends UserManager {
    @Override
    public void logIn(User user){
        System.out.println(user.getName()+" logged");
    }

    public void takeLesson(Student student,String lesson){
        System.out.println(student.getName()+" take the "+lesson+" course");
    }
    public void startCourse(User user){
        System.out.println(user.getName()+" started course");
    }

    public void showUserInfo(Student student){
        System.out.println("Name: " + student.getName());
        System.out.println("Address: " + student.getAddress());
        System.out.println("Phone: " + student.getPhoneNumber());
        System.out.println("E-Mail: " + student.getEmail());
        System.out.println("Number: " + student.getStudentNumber());
        System.out.println("Education Level: " + student.getEducationLevel());
        System.out.println("Lesson: " + student.getLesson());
    }
}
