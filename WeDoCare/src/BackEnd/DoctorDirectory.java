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
public class DoctorDirectory extends Person{

    public DoctorDirectory(String FirstName, String LastName, String id, LocalDate DOB, String Specialzation, String Hospital, String Address, String UserName, String Password, String ZipCode) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.id = id;
        this.DOB = DOB;
        this.Specialzation = Specialzation;
        this.Hospital = Hospital;
        this.Address = Address;
        this.UserName = UserName;
        this.Password = Password;
        this.ZipCode = ZipCode;
    }
   
    
    public String id;
    
    public String Specialzation;
    public String Hospital;
    public String Address;
    public String UserName;
    public String Password;
    public String ZipCode;

 
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public String getSpecialzation() {
        return Specialzation;
    }

    public void setSpecialzation(String Specialzation) {
        this.Specialzation = Specialzation;
    }

    public String getHospital() {
        return Hospital;
    }

    public void setHospital(String Hospital) {
        this.Hospital = Hospital;
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

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String ZipCode) {
        this.ZipCode = ZipCode;
    }
  
}
