package cr2;

public class User {
    private String userName = "admin";
    private String userPass = "password";

    public User(String userName, String userPass) {
        this.userName = userName;
        this.userPass = userPass;
    }

    public User(){}

    public String getUserName() {
        //check user credentials before sending the information
        return "you are not allowed";
    }

    public String getUserPass() {
        //check user credentials before sending the information
        return"you are not allowed";
    }
}
