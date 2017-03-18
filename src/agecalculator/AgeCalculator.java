/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agecalculator;

import java.util.Scanner;

/**
 *
 * @author Vid-Tech
 */
public class AgeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] myArray = dateArray();
        printArray(myArray);
    }
    public static int[] dateArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your date of birth (dd/mm/yyyy): ");
        String input = sc.nextLine();
        String[] stringArray = input.split("/");
        final int SIZE = stringArray.length;
        int[] intArray = new int[SIZE];
        
        for (int i = 0; i < SIZE; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        sc.close();
        return intArray;
    }
    
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    
}
