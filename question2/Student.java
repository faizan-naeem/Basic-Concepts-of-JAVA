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
abstract class Student {
    protected String name;
    protected final int feepercourse;
    protected final int totalcourses;
    int totalfee;

    public Student(String name) {
        this.name = name;
        this.feepercourse = 22500;
        this.totalcourses = 5;
    }
    abstract void calculatefee();
}
