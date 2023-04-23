
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author lab_services_student
 */
public class ICE_TASK1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double firstNum = getNumber("Enter the first number: ");
        double secondNum = getNumber("Enter the second number: ");
        double sum = calculateSum(firstNum, secondNum);
        double product = calculateProduct(firstNum, secondNum);
        System.out.println("The sum of " + firstNum + " and " + secondNum + " is " + sum);
        System.out.println("The product of " + firstNum + " and " + secondNum + " is " + product);
    }

    public static double getNumber(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        double num = scanner.nextDouble();
        return num;
    }

    public static double calculateSum(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }

    public static double calculateProduct(double num1, double num2) {
        double product = num1 * num2;
        return product;
    }
}
