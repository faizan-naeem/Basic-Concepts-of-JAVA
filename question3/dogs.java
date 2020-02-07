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
public class dogs extends creatures implements commonChars, dogTricks {
    
    @Override
    public void eatFood() {
        System.out.print("Dogs can eat dog food.");
    }

    @Override
    public void breathe() {
        System.out.print("Dogs can breathe.");
    }

    @Override
    public void walk() {
        System.out.print("Dogs can walk.");
    }

    @Override
    public void playDead() {
        System.out.print("Dogs can play dead.");
    }
}
