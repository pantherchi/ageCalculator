/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agecalculator;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
        System.out.println(myArray[2]);
        
        //method 01
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
        
        SimpleDateFormat sdf = new SimpleDateFormat("Y:M:d");
        System.out.println( sdf.format(cal.getTime()) );
        
        //method 02
        Date date = new Date();
        int cYear = date.getYear() + 1900;
        int cMonth = date.getMonth() + 1;
        int cDay = date.getDay();
        System.out.println(cYear+"/"+cMonth+"/"+cDay);
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
    public static int calc(){
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println( sdf.format(cal.getTime()) );
    }

//    public static void printArray(int[] array){
//        for(int i = 0; i < array.length; i++){
//            System.out.println(array[i]);
//        }
//    }
    
}
