/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agecalculator;

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] myArray = getDate();
		int bDay = myArray[0];
		int bMonth = myArray[1];
		int bYear = myArray[2];
        System.out.println("Date of birth: "+bYear + "/" + bMonth + "/" + bDay);
       
        Calendar cal = Calendar.getInstance();
        // System.out.println(cal.getTime());
        int cYear = cal.get(Calendar.YEAR);
        int cMonth = cal.get(Calendar.MONTH) + 1;
        int cDay = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("Current date: "+cYear + "/" + cMonth + "/" + cDay);
        
        Date bDate = new Date(cYear,bMonth,bDay);
        Date cDate = new Date(cYear,cMonth,cDay);
        // Date date = new Date (17,05,2020);
    	// int comparison = date.compareTo(bDate);
    	// System.out.println("Comparison Result:" + comparison);
        calcDate(bDate, cDate);
        
        // System.out.println(cal.get(Calendar.YEAR));
        // System.out.println(cal.get(Calendar.MONTH));
        // System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	}
	public static int[] getDate(){
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
    public static void calcDate(Date bD, Date cD){
    	System.out.println(bD.getTime());
    	System.out.println(cD.getTime());
    	boolean before = cD.before(bD);
    	if(before = true){
    		System.out.println((bD.getTime()-cD.getTime())/(1000*60*60*24));
    	}
    	
    	//17.05.2017
    	//22.03.2017
        //if compared to is bigger returns 1
        //if compared to is lower returns -1
        //if compared to is same returns 0
    	// Date date = new Date (17,05,2020);
    	// int comparison = bD.compareTo(cD);
    	// if(comparison == 1){
    	// 	//do the calculation
    	// 	// daysTill(cD,bD);
    	// 	System.out.println((365-(bD.getTime()-cD.getTime())/(1000*60*60*24)));
    	// }else if(comparison == 0){
    	// 	//both same date
    	// 	System.out.println("Happy Birthday!");
    	// }else{
    	// 	//the date is in the future
    	// 	System.out.println((bD.getTime()-cD.getTime())/(1000*60*60*24));
    	// }
    	// if(cD > bD){
    	// 	dD = cD - bD;
    	// 	System.out.println(dD);
    	// }else{
    	// 	dD = bD - cD;
    	// 	System.out.println(dD);
    	// }
    }
    // public static void daysTill(Date bD, Date cD){
    // 	System.out.println((cD.getTime()-bD.getTime())/(1000*60*60*24));
    // }
}
