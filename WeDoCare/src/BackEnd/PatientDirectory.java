/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

import java.time.LocalDate;

/**
 *
 * @author yashraj
 */
public class PatientDirectory extends Person{
    
    String gender;
    String patient_id;
    String blood_group;
    String Address;
    int Zipcode;
    String city;
    String UserName;
    String Password;

   
    
    
   
   

    public String getPatientId() {
        return patient_id;
    }

    public void setPatientId(String patient_id) {
        this.patient_id = patient_id;
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
   
     public PatientDirectory(String FirstName, String LastName, String patient_id,String gender, LocalDate DOB,String blood_group, String Address,int Zipcode,String city, String UserName, String Password) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.patient_id = patient_id;
        this.gender = gender;
        this.DOB = DOB;
        this.blood_group = blood_group;
        this.Address = Address;
        this.Zipcode = Zipcode;
        this.city = city;
        this.UserName = UserName;
        this.Password = Password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBlood_group() {
        return blood_group;
    }

    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }

    public Integer getZipcode() {
        return Zipcode;
    }

    public void setZipcode(Integer Zipcode) {
        this.Zipcode = Zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
