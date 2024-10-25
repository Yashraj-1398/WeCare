/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

/**
 *
 * @author yashraj
 */
public class HospitalRegisteration {

    public HospitalRegisteration(String hospital_name, Long zipcode, String Hospital_id, String doctor_name, String community, String address, String specialisation) {
        this.hospital_name = hospital_name;
        this.zipcode = zipcode;
        this.Hospital_id = Hospital_id;
        this.doctor_name = doctor_name;
        this.community = community;
        this.address = address;
        this.specialisation = specialisation;
    }

    public String getHospital_name() {
        return hospital_name;
    }

    public void setHospital_name(String hospital_name) {
        this.hospital_name = hospital_name;
    }

    public Long getZipcode() {
        return zipcode;
    }

    public void setZipcode(Long zipcode) {
        this.zipcode = zipcode;
    }

    public String getHospital_id() {
        return Hospital_id;
    }

    public void setHospital_id(String Hospital_id) {
        this.Hospital_id = Hospital_id;
    }
    
    String hospital_name;
    Long zipcode;
    String Hospital_id;
    String doctor_name;
    String community;
    String specialisation;
    String address;

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }
            
    
}
