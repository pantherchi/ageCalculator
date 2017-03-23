package agecalculator;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class AgeCalculator {
    public static void main (String[] args){
        int[] myArray = getDate();
        int bDay = myArray[0];
        int bMonth = myArray[1];
//        int bYear = myArray[2];
//        System.out.println("Date of birth: "+bYear + "/" + bMonth + "/" + bDay);
       
        Calendar cal = Calendar.getInstance();
        int cYear = cal.get(Calendar.YEAR);
        int cMonth = cal.get(Calendar.MONTH) + 1;
        int cDay = cal.get(Calendar.DAY_OF_MONTH);
//        System.out.println("Current date: "+cYear + "/" + cMonth + "/" + cDay);
        
        //to calculate days till
        Date bDate = new Date(cYear,bMonth,bDay);
        Date cDate = new Date(cYear,cMonth,cDay);
        daysTill(bDate, cDate, bDay, bMonth, cYear);
    }
    //this method will get the input from the user!
    public static int[] getDate(){
        int[] intArray;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your date of birth (dd/mm/yyyy): ");
            String input = sc.nextLine();
            String[] stringArray = input.split("/");
            final int SIZE = stringArray.length;
            intArray = new int[SIZE];
            for (int i = 0; i < SIZE; i++) {
                intArray[i] = Integer.parseInt(stringArray[i]);
            }
        }
        return intArray;
    }
    //this method will take two date objects to undergo arithmetics
    public static void daysTill(Date bD, Date cD,int bDay, int bMonth, int cYear){        
    	int comparison = bD.compareTo(cD);
        if(bMonth == 2 && bDay == 29){
            if(isLeapYear(cYear) == true){
                System.out.println("Current is a leap year");
            }else{
                System.out.println("Current is not a leap year");
                for(int i = 1;i <= 3 ; i++){
                    boolean b = isLeapYear(cYear + i);
                    if(b == true){
//                        System.out.println("Year " + (cYear + i) +" is a leap year.");
                        System.out.println("Next leap year is in "+ i + " year.");
                        
                        int years = cYear + i;
                        leapYearCalc(years, cD);
                    }else{
                        i++;
                    }
                }
            }
        }else{
            switch (comparison) {
                case 1:
                    //do the calculation
                    System.out.println("Your birthday is in " + (bD.getTime()-cD.getTime())/(1000*60*60*24) + " days.");
                    break;
                case 0:
                    //both same date
                    System.out.println("Happy Birthday!");
                    break;
                default:
                    //the date is in the future???
                    System.out.println("Your birthday is in " + (365-(bD.getTime()-cD.getTime())/(1000*60*60*24)) + " days.");
                    break;
            }
        }
    }
    //checks if the next year is a leap year
    public static boolean isLeapYear(int Year){
        return (Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0);        
    }
    public static void leapYearCalc(int y,Date cD){
        Date dDate = new Date(y,2,29);
        System.out.println("Your birthday is in " + ((((dDate.getTime()-cD.getTime())/(1000*60*60*24))+2) + " days."));
    }
}
