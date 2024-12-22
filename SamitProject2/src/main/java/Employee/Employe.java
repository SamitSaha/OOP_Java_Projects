/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employee;

/**
 *
 * @author iit
 */
abstract class Employe {
    private String firstName = "";
    private String lastName = "";
    private double monthlySalary = 0.0;
    
    public Employe(String f, String l, double m){
        if(m<0){
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.firstName = f;
        this.lastName = l;
        this.monthlySalary = m;
    }
    
    // getter and setter settings. 
    public double getMonthlySalary(){
        return monthlySalary;
    }
    public void setMonthlySalary(double m){
        if(m<0){
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.monthlySalary = m;
    }
    
    //Abstract method of salary
    public abstract double Salary();
    
    @Override
    public String toString(){
        return "EMPLOYEE " + firstName + " " + lastName + " Monthly Salary is $ " + monthlySalary;
    }
}
