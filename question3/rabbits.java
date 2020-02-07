/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author Faizan
 */
public class rabbits extends creatures {
    
    @Override
    public void eatFood() {
        System.out.print("Rabbits can eat rabbit food.");
    }

    @Override
    public void breathe() {
        System.out.print("Rabbits can breathe.");
    }
    public void hops() {
        System.out.print("Rabbits can hop.");
    }
}
