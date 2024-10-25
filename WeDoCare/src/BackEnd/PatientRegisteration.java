/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

/**
 *
 * @author yashraj
 */
public class PatientRegisteration {
    String FirstName;
    String LastName;
    String id;
    int Age;
    String Symptoms;
    String Address;
    String UserName;
    String Password;

   
    
    
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getSymptoms() {
        return Symptoms;
    }

    public void setSymptoms(String Symptoms) {
        this.Symptoms = Symptoms;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
   
     public PatientRegisteration(String FirstName, String LastName, String id, int Age, String Symptoms, String Address, String UserName, String Password) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.id = id;
        this.Age = Age;
        this.Symptoms = Symptoms;
        this.Address = Address;
        this.UserName = UserName;
        this.Password = Password;
    }
}
