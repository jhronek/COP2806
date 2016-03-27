package TOBA;

/**
 * This class stores user information gathered from html form.
 * @author jhronek
 */
public class User {
    // Initialize variables
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private String email;
    
    // Default constructor
    public User() {
    }
    
    // Constructor with all variables from form
    public User(String firstName, String lastName, String phone, String address,
            String city, String state, String zip, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zip;
        this.email = email;
    }
    
    // First Name getter
    public String getFirstName() {
        return firstName;
    }
    
    // First Name setter
    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }

    // Last Name getter
    public String getLastName() {
        return lastName;
    }

    // Last Name setter
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Phone getter
    public String getPhone() {
        return phone;
    }

    // Phone setter
    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Address getter
    public String getAddress() {
        return address;
    }

    // Address setter
    public void setAddress(String address) {
        this.address = address;
    }

    // City getter
    public String getCity() {
        return city;
    }

    // City setter
    public void setCity(String city) {
        this.city = city;
    }

    // State getter
    public String getState() {
        return state;
    }

    // State setter
    public void setState(String state) {
        this.state = state;
    }

    // Zipcode getter
    public String getZipcode() {
        return zipcode;
    }

    // Zipcode setter
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    // Email getter
    public String getEmail() {
        return email;
    }

    // Email setter
    public void setEmail(String email) {
        this.email = email;
    }
}
