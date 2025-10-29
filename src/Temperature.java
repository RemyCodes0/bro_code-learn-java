import java.util.Scanner;
public class Temperature{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;

        String unit;

        System.out.print("Enter the tempterature");
        temp = scanner.nextDouble();


        System.out.println("Convert to Celsium or Fahrenheit?(C or F): ");
        unit = scanner.next().toUpperCase();

        //  newTemp = (unit == "C") ? ((9/5)*(temp + 32)): (5/9)*temp -32;

        newTemp = (unit.equals("C")) ? (temp - 32)* 5/9 : (temp * 5/9)+32;
        

        System.out.printf("The temperature is now: %.1f %s", newTemp, unit );



        scanner.close();
    }
}
 