/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.ArrayList;

/**
 *
 * @author Faizan
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Student> temp = new ArrayList();
        temp.add(new typeB("Munam"));
        temp.add(new typeC("Ibrahim"));
        temp.add(new typeA("Wasey"));
        for(int i=0;i<temp.size();i++)
            temp.get(i).calculatefee();
    }
    
}
