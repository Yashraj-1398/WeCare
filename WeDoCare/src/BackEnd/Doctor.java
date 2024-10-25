/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

/**
 *
 * @author yashraj
 */
public class Doctor {
 String FirstName;
    String LastName;
    int age;
    String specialization;
    String email_id; 
    Long phoneno;
    String Hospital;

    public String getHospital() {
        return Hospital;
    }

    public void setHospital(String Hospital) {
        this.Hospital = Hospital;
    }
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public Long getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(Long phoneno) {
        this.phoneno = phoneno;
    }

    public Doctor(String FirstName, String LastName, int age, String specialization, String email_id, Long phoneno, String Hospital) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.age = age;
        this.specialization = specialization;
        this.email_id = email_id;
        this.phoneno = phoneno;
        this.Hospital = Hospital;
    }
   
}
