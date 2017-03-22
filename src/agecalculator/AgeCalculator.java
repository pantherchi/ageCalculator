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
        int cYear = cal.get(Calendar.YEAR);
        int cMonth = cal.get(Calendar.MONTH) + 1;
        int cDay = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("Current date: "+cYear + "/" + cMonth + "/" + cDay);
        
        //to calculate days till
        Date bDate = new Date(cYear,bMonth,bDay);
        Date cDate = new Date(cYear,cMonth,cDay);
        daysTill(bDate, cDate);
	}
	//this method will get the input from the user!
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
    //this method will take two date objects to undergo arithmetics
    public static void daysTill(Date bD, Date cD){
    	int comparison = bD.compareTo(cD);
    	if(comparison == 1){
    		//do the calculation
    		System.out.println("Your birthday is in " + (bD.getTime()-cD.getTime())/(1000*60*60*24) + " days.");
    	}else if(comparison == 0){
    		//both same date
    		System.out.println("Happy Birthday!");
    	}else{
    		//the date is in the future???
    		System.out.println("Your birthday is in " + (365-(bD.getTime()-cD.getTime())/(1000*60*60*24)) + " days.");
    	}
    	}
}
