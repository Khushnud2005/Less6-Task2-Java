package uz.exemple.less6_task2_java.model;

public class UserModel {
    private String firstName;
    private String lastName;

    public UserModel(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getfirstName() {
        return firstName;
    }

    public String getlastName() {
        return lastName;
    }

}
