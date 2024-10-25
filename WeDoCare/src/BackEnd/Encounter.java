/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

import java.util.Date;

/**
 *
 * @author yashraj
 */
public class Encounter {
    String patient_id;
    String doctor_name;
    String appointment_date;

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public String getAppointment_date() {
        return appointment_date;
    }

    public void setAppointment_date(String appointment_date) {
        this.appointment_date = appointment_date;
    }

    public String getAppointment_time() {
        return appointment_time;
    }

    public void setAppointment_time(String appointment_time) {
        this.appointment_time = appointment_time;
    }

    public Encounter(String patient_id, String doctor_name, String appointment_date, String appointment_time) {
        this.patient_id = patient_id;
        this.doctor_name = doctor_name;
        this.appointment_date = appointment_date;
        this.appointment_time = appointment_time;
    }
    String appointment_time;
}
