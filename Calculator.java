import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n1 = input.nextInt();
        System.out.print("Enter a Second number : ");
        int n2 = input.nextInt();
        System.out.println("Enter a option : \n 1.Add \n 2.Subtract \n 3.Multiply \n 4.Divide");
        int n3 = input.nextInt();
        switch (n3) {
            case 1:
                System.out.println("Adding " + n1 + " and " + n2 + " is " + (n1 + n2));
                break;
            case 2:
                System.out.println("Subtracting " + n1 + " and " + n2 + " is " + (n1 - n2));
                break;
            case 3:
                System.out.println("Multiplying " + n1 + " and " + n2 + " is " + (n1 * n2));
                break;
            case 4:
                System.out.println("Dividing " + n1 + " and " + n2 + " is " + (n1 / n2));
                break;
            default:
                System.out.println("Wrong Input");
        }
    }

    }

