/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employee;

/**
 *
 * @author iit
 */
public class Main {
    public static void main(String[] args) {
        CommissionedEmployee c = new CommissionedEmployee("Samit 1", "Saha", 2000, 5000, 0.1);
        System.out.println(c);
        System.out.println("Total Salary: $" + c.Salary() + "\n");
        // use the get set methods to update the values. 
        //set the new values. 
        c.setTotalSales(6000);
        c.setComissionRate(0.15);
        System.out.println("Updated Total Salary: $" + c.Salary() + "\n");
        // get the updated values. 
        System.out.println("Updated Total Sales: $" + c.geTotaltSales());
        System.out.println("Updated Commission Rate: " + c.getComissionRate() + "\n");

        
        
        HourlyEmployee h = new HourlyEmployee("Samit 2", "Saha", 1500, 160, 20);
        System.out.println(h);
        System.out.println("Total Salary: $" + h.Salary() + "\n");
        // use the get set methods to update the values. 
        //set the new values. 
        h.setTotalWorks(200);
        h.setHourlyRate(40);
        System.out.println("Updated Total Salary: $" + h.Salary() + "\n");
        // get the updated values. 
        System.out.println("Updated Hourly Works: $" + h.geTotaltWorks());
        System.out.println("Updated Hourly Rates: " + h.getHourlyRate() + "\n");
        
    }
}
