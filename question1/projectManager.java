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
public class projectManager extends employee implements basicBenefits, developerBenefits, managerBenefits {

    @Override
    void calculatePay() {
        System.out.print("\nManager pay is Rs.90000\n");
    }

    @Override
    void employeebenefits() {
        System.out.print("\nManager Benefits are\n");
        for(int i=0;i<basic.size();i++)
            System.out.print(basic.get(i));
        for(int i=0;i<developer.size();i++)
            System.out.print(developer.get(i));
        for(int i=0;i<manager.size();i++)
            System.out.print(manager.get(i));
    }
    
}
