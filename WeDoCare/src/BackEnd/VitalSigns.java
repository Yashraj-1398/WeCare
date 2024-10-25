/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

/**
 *
 * @author yashraj
 */
public class VitalSigns {
    String tempreture;
    String throat;
    String blood_pressure;
    String pulse;

    public VitalSigns(String tempreture, String throat, String blood_pressure, String pulse) {
        this.tempreture = tempreture;
        this.throat = throat;
        this.blood_pressure = blood_pressure;
        this.pulse = pulse;
    }

    public String getTempreture() {
        return tempreture;
    }

    public void setTempreture(String tempreture) {
        this.tempreture = tempreture;
    }

    public String getThroat() {
        return throat;
    }

    public void setThroat(String throat) {
        this.throat = throat;
    }

    public String getBlood_pressure() {
        return blood_pressure;
    }

    public void setBlood_pressure(String blood_pressure) {
        this.blood_pressure = blood_pressure;
    }

    public String getPulse() {
        return pulse;
    }

    public void setPulse(String pulse) {
        this.pulse = pulse;
    }
       
}
