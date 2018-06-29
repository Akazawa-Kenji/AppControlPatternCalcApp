/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcontrollercalcapp;

/**
 *
 * @author Crazian
 */
public class Multiply implements compute {

    public void execute(Integer num1, Integer num2) {
        Integer prod = num1 * num2;
        System.out.println(prod);
    }

}
