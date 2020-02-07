/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author Faizan
 */
public class typeA extends Student {

    public typeA(String name) {
        super(name);
    }
    
    @Override
    void calculatefee() {
        totalfee = (int) (totalcourses*feepercourse*0.5);
        System.out.print(name+" fees is "+totalfee+"\n\n");
    }
    
}
