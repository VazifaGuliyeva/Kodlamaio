public class UserManager {
    public void logIn(User user){
        System.out.println(user.getName()+" logged in");
    }
    public void add(User user){
        System.out.println(user.getName()+" added");
    }
    public void remove(User user){
        System.out.println(user.getName()+"removed");
    }
    public void showUserInfo(User user){
        System.out.println("Name:"+user.getName());
        System.out.println("Address:"+user.getAddress());
        System.out.println("PhoneNumber:"+user.getPhoneNumber());
        System.out.println("Email:"+user.getEmail());
    }
}
