/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employee;

/**
 *
 * @author iit
 */
public class HourlyEmployee extends Employe{
    private double hoursWork; 
    private double hourlyRate;
    
    public HourlyEmployee(String f, String l, double m, double w, double r){
        super(f, l, m);
        if( w<0 || r<0){
            throw new IllegalArgumentException("Invalid hoursWork/hourlyRate");
        }
        this.hoursWork = w;
        this.hourlyRate = r;
    }
    
    //getter and setter 
    public double geTotaltWorks(){
        return hoursWork;
    }
    public void setTotalWorks(double w){
        if (w < 0) {
            throw new IllegalArgumentException("Hours Work cannot be negative.");
        }
        this.hoursWork = w;
    }
    public double getHourlyRate(){
        return hourlyRate;
    }
    public void setHourlyRate(double r){
        if (r < 0 ) {
            throw new IllegalArgumentException("Hourly Rate cannot be negative.");
        }
        this.hourlyRate = r;
    }
    
    @Override
    public double Salary(){
        return getMonthlySalary() + (hoursWork * hourlyRate);
    }
}
