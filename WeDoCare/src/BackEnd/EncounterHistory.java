/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;
import java.util.*;
/**
 *
 * @author yashraj
 */
public class EncounterHistory {

    
    String patient_name;
    String patient_id;
    String city;
    String symptoms;
    int encounter_no;
    Integer blood_pressure;
    Double heart_rate;
    Double tempreture;
    Integer pulse;
    String doctor_name;
    String doctor_id;
    String medication;
    String diet;
    String hospital;

    public EncounterHistory(String patient_name, String patient_id, String city ,String symptoms, int encounter_no, Integer blood_pressure, Double heart_rate, Double tempreture, Integer pulse, String doctor_name, String doctor_id, String medication, String diet,String hospital, Date date_of_checkup) {
        this.patient_name = patient_name;
        this.patient_id = patient_id;
        this.city = city;
        this.symptoms = symptoms;
        this.encounter_no = encounter_no;
        this.blood_pressure = blood_pressure;
        this.heart_rate = heart_rate;
        this.tempreture = tempreture;
        this.pulse = pulse;
        this.doctor_name = doctor_name;
        this.doctor_id = doctor_id;
        this.medication = medication;
        this.diet = diet;
        this.hospital = hospital;
        this.date_of_checkup = date_of_checkup;
        
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public Integer getEncounter_no() {
        return encounter_no;
    }

    public void setEncounter_no(Integer encounter_no) {
        this.encounter_no = encounter_no;
    }

    public Integer getBlood_pressure() {
        return blood_pressure;
    }

    public void setBlood_pressure(Integer blood_pressure) {
        this.blood_pressure = blood_pressure;
    }

    public Double getHeart_rate() {
        return heart_rate;
    }

    public void setHeart_rate(Double heart_rate) {
        this.heart_rate = heart_rate;
    }

    public Double getTempreture() {
        return tempreture;
    }

    public void setTempreture(Double tempreture) {
        this.tempreture = tempreture;
    }

    public Integer getPulse() {
        return pulse;
    }

    public void setPulse(Integer pulse) {
        this.pulse = pulse;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public String getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(String doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public Date getDate_of_checkup() {
        return date_of_checkup;
    }

    public void setDate_of_checkup(Date date_of_checkup) {
        this.date_of_checkup = date_of_checkup;
    }
   
    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    Date date_of_checkup;
}
