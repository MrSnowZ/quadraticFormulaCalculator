import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class codingAssignment4 {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        // Part 1 (this was way too hard to figure out)
        int num;
        int den;

        System.out.println("Enter X:");
        num = keyboard.nextInt();
        System.out.println("Enter Y:");
        den = keyboard.nextInt();

        if(den != 0)
        {
            int a = num/den;
            int b = num*den;
            System.out.println("Result:" + a +" "+"or " + b + "/"+ den);
        }
        else 
        {
            System.out.println("Please enter a valid Denominator!");
        }
    



        //Part 2
        System.out.println("Part 2:");

        double a = 1,b = 1,c = 1;
        
        //Get values for A, B, and C from the user
        System.out.println("Enter A:");
        a = keyboard.nextDouble();
        System.out.println("Enter B:");
        b = keyboard.nextDouble();
        System.out.println("Enter C:");
        c = keyboard.nextDouble();

        double d = b*b - 4*a*c;
        System.out.println("Calculating answer...");

        if(d > 0.0)
        {
            double x1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);  
            double x2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);  
            System.out.println("The two X values are: " + x1 + " and " + x2);  
        }
        else if(d == 0)
        {
            double x1 = -b / (2.0 * a);  
            System.out.println("The root is " + x1);  
        }
        else 
        {
            System.out.println("There are so solutions!");
        }

        








        

    }
    
}
