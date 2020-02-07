/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author Faizan
 */
public class intern extends employee implements basicBenefits {

    @Override
    void calculatePay() {
        System.out.print("\nIntern pay is Rs.20000\n");
    }

    @Override
    void employeebenefits() {
        System.out.print("\nIntern Benefits are\n");
        for(int i=0;i<basic.size();i++)
            System.out.print(basic.get(i));
    }
    
}
