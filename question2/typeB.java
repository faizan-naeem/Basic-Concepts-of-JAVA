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
public class typeB extends Student {
    public typeB(String name) {
        super(name);
    }
    
    @Override
    void calculatefee() {
        totalfee = (int) (totalcourses*feepercourse);
        System.out.print(name+" fees is "+totalfee+"\n\n");
    }
}
