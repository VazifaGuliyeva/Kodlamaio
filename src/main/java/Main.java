public class Main {
    public static void main(String[] args) {
        User user=new User("Vazifa","Yasamal","077 342 61 32","vezife07102002@gmail.com","vzf1234");

        Student student = new Student("Engin","TURKEY","543-233-45-12","engin@gmail.com","654321","1","Math","Highschool");
        Student student1 = new Student("Mahmut","TURKEY","534-234-12-32","mahmut@gmail.com","65463","2","Physic","University");


        Student [] students=new Student[]{student,student1};

        Instructor instructor = new Instructor("Emre","TURKEY","543-123-43-54","emre@gmail.com","123456",5432.00,"Chemistry",students);


        UserManager userManager = new UserManager();
        userManager.add(user);
        userManager.logIn(user);
        userManager.showUserInfo(user);
        System.out.println("========================");

        StudentManager studentManager = new StudentManager();
        studentManager.add(student);
        studentManager.logIn(student);
        studentManager.startCourse(student);
        studentManager.takeLesson(student,"Math");
        studentManager.showUserInfo(student);
        System.out.println("========================");

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor);
        instructorManager.logIn(instructor);
        instructorManager.giveLesson(instructor,"Physic");
        instructorManager.showUserInfo(instructor);

    }
}
