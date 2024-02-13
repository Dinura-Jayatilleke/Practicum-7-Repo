// Practicum 7 - Fahrenheit to Celsius Program

// ----------------------------------------------------------
// This program will convert Fahrenheit to Celsius
// ----------------------------------------------------------
import java.util.*;
public class main {
  public static void main(String[] args) {
    
    // init
    Scanner input = new Scanner(System.in);
    
    // program greeting
    System.out.println(
      "\nConverts temperatures in Fahrenheit to Celsius\n");

    // prompt for input
    System.out.println("Enter temperature (in Fahrenheit): ");
    double fah_temp = input.nextDouble();


    // display results
    System.out.println(fah_temp + " Fahrenheit = " + 
                       convertToCelsius(fah_temp) +
                       " degrees Celsius");
  
  }

  public static double convertToCelsius(double fah_temp) {
    return (fah_temp-32)*(5/9);
  }
  
}