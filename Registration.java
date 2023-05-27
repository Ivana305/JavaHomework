package JavaProject02;

public class Registration {/*Create Registration Class in which you would have variables as email, userName and password
that have an access scope only within its own class. After creating an object of the class user should be able to call methods
 and in each method separately pass values to set users email, username and password.
Requirements: A. Valid email consider to be only yahoo B. Valid userName and password cannot be empty
and should be of length larger than 6 characters. Also valid password cannot contain userName. */
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if (email.endsWith("yahoo.com")){
            this.email = email;
            System.out.println("your email is set");
        }else{
            System.out.println("Invalid email,please enter yahoo email");
        }
    }

    public void setUserName(String userName) {
        if (userName.length()<6){
            System.out.println("Username must be at least 6 characters");
        } else if (userName.isEmpty()) {
            System.out.println("Username can not be empty");
        } else {
            this.userName = userName;
            System.out.println("Your username is set");
        }

    }

    public void setPassword(String password) {
        if (password.isEmpty()){
            System.out.println("Password field can not be empty");
        } else if (password.contains(userName)){
            System.out.println("Password can not contain username");
        } else if (password.length()<6){
            System.out.println("Password must be at least 6 characters");
        }else {
            this.password = password;
            System.out.println("Your password is set");}
    }
}
class RegistartionTester{
    public static void main(String[] args) {
        Registration registration=new Registration();
        registration.setEmail("exemple@yahoo.com");
        registration.setUserName("ghfhgfh");
        registration.setPassword("135156");
    }
}
