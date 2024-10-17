public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person() {
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String name, String age) {
    }

    public String getFirstName(String firstName, String lastName, int age) {
        return firstName + " " + lastName;
    }

}
