/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcontrollercalcapp;

import java.util.Scanner;

/**
 *
 * @author Crazian
 */
public class AppControllerCalcApp {

    public static void main(String[] args) {

        // Define Variables call our method from controller class
        controller control = new controller();

        Integer int1;
        Integer int2;
        String symbol;
        Scanner input = new Scanner(System.in);

        // Recieve user input and put them into our variables
        System.out.println("Enter first integer value: ");
        int1 = Integer.parseInt(input.nextLine());

        System.out.println("Enter one of the mathmatical Symbols (-, +, /, *): ");
        symbol = input.nextLine();
        // 
        System.out.println("Enter second integer value: ");
        int2 = Integer.parseInt(input.nextLine());

        // Print the first
        System.out.print(int1 + " " + symbol + " " + int2 + " = ");
        control.handleCommand(symbol, int1, int2);

    }

}
