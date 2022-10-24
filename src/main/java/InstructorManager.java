public class InstructorManager extends UserManager {
    @Override
    public void logIn(User user) {
        System.out.println(user.getName() + " logged in");
    }

    public void giveLesson(Instructor instructor, String lesson){
        System.out.println(instructor.getName() + " teaches " + lesson);
    }

    public void showUserInfo(Instructor instructor){
        System.out.println("Name: " + instructor.getName());
        System.out.println("Address: " + instructor.getAddress());
        System.out.println("Phone: " + instructor.getPhoneNumber());
        System.out.println("E-Mail: " + instructor.getEmail());
        System.out.println("Salary: " + instructor.getSalary());
        System.out.println("Course: " + instructor.getCourse());
    }
}
