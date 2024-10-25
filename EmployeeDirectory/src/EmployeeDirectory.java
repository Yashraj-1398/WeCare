 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yashraj
 */
import java.util.ArrayList;

public class EmployeeDirectory {
    private  ArrayList<Employee> emp;
    
    public EmployeeDirectory(){
        this.emp = new ArrayList<Employee>();
    }
    
    public ArrayList<Employee> getEmployee(){
        return emp;
    }
    public void setEmployee(ArrayList<Employee> emp){
        this.emp = emp;
    }
    
    public Employee addnewEmployee(){
    
    Employee EmpDetails = new Employee();
    emp.add(EmpDetails);
    return EmpDetails;
    }
}
    
    
    
    
    
    
    
    
    
    
    
    

