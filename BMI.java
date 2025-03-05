import java.util.Scanner;


public class BMI
 {
   public static void main (String args []) 
   {
    double weight,height,bmi;
    Scanner sc = new Scanner (System.in);

    System.out.println("enter your weight in kg ");
    weight = sc.nextDouble();
    System.out.println("Enter your height in m");
    height = sc.nextDouble();
    
    bmi= weight / (height * height);
    System.out.println("Your BMI is :-"+ bmi);

    if(bmi < 18.5)
     {
        System.out.println("You are underweight.");
     }
     else if (bmi >= 18.5 && bmi < 24.9)
      {
        System.out.println("You have a normal weight.");
      }
     else if (bmi >= 25 && bmi < 29.9)
      {
        System.out.println("You are overweight.");
      } 
    else 
      {
        System.out.println("You are obese.");
      }
    
   } 
 }
