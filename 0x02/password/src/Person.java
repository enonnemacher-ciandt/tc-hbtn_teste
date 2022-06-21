public class Person {

    public boolean checkUser(String userName){
        return userName.matches("[a-zA-Z0-9]{8,}");
    }

    public boolean checkPassword(String password){
        return password.matches("(?=.*[\\d])(?=.*[\\W])(?=.*[\\w]).{8,}");
    }
}
