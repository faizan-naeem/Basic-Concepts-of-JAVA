/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import java.util.ArrayList;

/**
 *
 * @author Faizan
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<employee> driver = new ArrayList();
        driver.add(new intern());
        driver.add(new developer());
        driver.add(new projectManager());
        driver.add(new intern());
        driver.add(new developer());
        driver.add(new projectManager());
        for(int i=0;i<driver.size();i++)
        {
            driver.get(i).employeebenefits();
            driver.get(i).calculatePay();
        }
    }
    
}
