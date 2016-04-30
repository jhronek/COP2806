package TOBA;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class stores user information gathered from html form.
 * @author jhronek
 */

@Entity
@Table(name = "User")
public class User implements Serializable{
    // Initialize variables
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    @Column(unique = true)
    private String email;
    private String username;
    private String password;
      
    
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
        this.createUsername(firstName + lastName + zipcode);
        this.setPassword("welcome1");
    }
    
    public Long getUserId() {
        return userId;
    }
    
    public void setUserId(Long userId) {
        this.userId = userId;
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
    
    // Get Username
    public String getUsername() {
        return username;
    }    

    public void createUsername(String username) {
        this.username = username;
    }
    // Set the password
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPassword() {
        return password;
    }
}
