public class UserBuilder {


    String name;
    String emailAddress;
    int age;
    String address;
    String city;
    String zipCode;

    /*public User(String name, String emailAddress, int age, String address, String city, String zipCode, Gender gender) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.age = age;
        this.address = address;
        this.city = city;
        this.zipCode = zipCode;
        this.gender = gender;
    }
    */

    public UserBuilder(String name) {
        this.name = name;
    }

    public UserBuilder emailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    public UserBuilder age(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder address(String address) {
        this.address = address;
        return this;
    }

    public UserBuilder city(String city) {
        this.city = city;
        return this;
    }

    public UserBuilder zipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public User build() {
        return new User(this);
    }
}
