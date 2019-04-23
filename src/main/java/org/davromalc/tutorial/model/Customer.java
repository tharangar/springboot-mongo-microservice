package org.davromalc.tutorial.model;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Customer {

    @Id
    public String id;

    public String firstName;
    public String lastName;
    public String title;
    public String location;
    public String country;
    public String phonenumber;
    public String middleName;
    
 // Constructors
    public Customer() {}
 // constructor two
    public Customer(String id, String firstName, String lastName, String middleName) {
      this.id = id;
      this.firstName = firstName;
      this.lastName = lastName;
      this.middleName = middleName;
    }
    
    // Id  needs to be converted to string
    public String get_id() { return id; }
    public void set_id(String id) { this.id = id; }

}
