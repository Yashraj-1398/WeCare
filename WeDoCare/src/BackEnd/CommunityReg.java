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
public class CommunityReg {
    String community_name;
    String community_address;
    LocalDate dof;
    String UserName ;
    String Password;

    public CommunityReg(String community_name, String community_address, LocalDate dof, String UserName, String Password) {
        this.community_name = community_name;
        this.community_address = community_address;
        this.dof = dof;
        this.UserName = UserName;
        this.Password = Password;
    }

    public String getCommunity_name() {
        return community_name;
    }

    public void setCommunity_name(String community_name) {
        this.community_name = community_name;
    }

    public String getCommunity_address() {
        return community_address;
    }

    public void setCommunity_address(String community_address) {
        this.community_address = community_address;
    }

    public LocalDate getDof() {
        return dof;
    }

    public void setDof(LocalDate dof) {
        this.dof = dof;
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
}
