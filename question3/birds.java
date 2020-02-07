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
public class birds extends creatures implements commonChars, birdTricks {
    @Override
    public void eatFood() {
        System.out.print("Birds can eat bird food.");
    }

    @Override
    public void breathe() {
        System.out.print("Birds can breathe.");
    }

    @Override
    public void walk() {
        System.out.print("Birds can walk.");
    }
    public void fly() {
        System.out.print("Birds can fly.");
    }
    public void makeNest() {
        System.out.print("Birds can make nest.");
    }

    @Override
    public void singSong() {
        System.out.print("Birds can sing songs.");
    }
}
