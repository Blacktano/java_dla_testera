package model;

import exceptions.IllegalEmailFormatException;

import java.util.Objects;

public class User implements Comparable<User> {

    private static int userCounter = 0;

    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private boolean isAdult;


    //Konstruktor


    public User(String firstName, String lastName, String email, int age) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isUserAdult();
        userCounter++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws IllegalEmailFormatException {
        if (email.endsWith(".ru")) {
            throw new IllegalEmailFormatException("In correct email format");
        } else {
            this.email = email;
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    public User(String firstNameParam, String lastNameParam) {
    }


    // Metody - to co dany obiekt potrafi zrobić

    public void getFullName() {
        // ciało metody
        System.out.println(firstName + " " + lastName);

    }

    public void getAllInfo() {
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }

    public int getUserAge() {

        return age;

    }

    public boolean isUserAdult() {

        if (age >= 18) {
            return true;
        } else {
            return false;
        }

    }

    public void greetings(String name) {

        System.out.println("Hi" + " " + name + ". Nice to see you!");

    }

    public void greetings(String firstName, String lastName) {

        System.out.println("Hi" + " " + firstName + " " + lastName + ". Nice to see you!");

    }


    public void howOldAreYou(String name, int userAge) {

        System.out.println("Hi " + name + " you are " + userAge + ". Nice to see you!");

    }

    public int yourAgePlus10(int userAge) {

        return userAge + 10;

    }

    public static int getUserCounter() {
        return userCounter;
    }

    @Override
    public String toString() {
        return "User{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", email='" + email + '\'' + ", age=" + age + ", isAdult=" + isAdult + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && isAdult == user.isAdult && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, age, isAdult);
    }

    @Override
    public int compareTo(User user) {
        int compareResult = this.getFirstName().compareTo(user.getFirstName());
        if(compareResult ==0){
            compareResult = this.getLastName().compareTo(user.getLastName());
        }
        return compareResult;

    }
}
