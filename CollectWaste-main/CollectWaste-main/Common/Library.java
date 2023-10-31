/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

import java.util.Scanner;

/**
 *
 * @author HI
 */
public class Library {

    Scanner sc = new Scanner(System.in);

    public int inputInt(String mess, int min) {
        System.out.print(mess);
        while (true) {
            String input = sc.nextLine();
            try {
                int number = Integer.parseInt(input);
                if (number < min) {
                    System.out.print("Please input greater than " + min + ": ");
                    continue;
                }
                return number;
            } catch (Exception e) {
                System.out.print("Please input an integer number: ");
            }
        }
    }

    public int[] inputArray(String mess, int length) {
        System.out.println(mess);
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            int input = inputInt(i+1 + ". " , 0);
            array[i] = input;
        }
        return array;
    }
}
