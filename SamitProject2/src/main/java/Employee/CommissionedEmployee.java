/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employee;

/**
 *
 * @author iit
 */
class CommissionedEmployee extends Employe {
    private double totalSales; 
    private double comissionRate;
    
    public CommissionedEmployee(String f, String l, double m, double t, double c){
        super(f, l, m);
        if( m<0 || t<0 || c<0 || c>1){
            throw new IllegalArgumentException("Invalid salary/sales/comission");
        }
        this.totalSales = t;
        this.comissionRate = c;
    }
    
    //getter and setter 
    public double geTotaltSales(){
        return totalSales;
    }
    public void setTotalSales(double t){
        if (t< 0) {
            throw new IllegalArgumentException("Total sales cannot be negative.");
        }
        this.totalSales = t;
    }
    public double getComissionRate(){
        return comissionRate;
    }
    public void setComissionRate(double c){
        if (c < 0 || c > 1) {
            throw new IllegalArgumentException("Comission Rate cannot be negative.");
        }
        this.comissionRate = c;
    }
    
    @Override
    public double Salary(){
        return getMonthlySalary() + (totalSales * comissionRate);
    }
}
