import java.util.InputMismatchException;
import java.util.Scanner; //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    try{
        System.out.println("Enter a whole number to divide : ");
        int x = scanner.nextInt();
        System.out.println("Enter a whole number to divide y: ");
        int y = scanner.nextInt();

        int z = x / y;
        System.out.println("Result : " + z); // .ArithmeticException: / by zero
    }
    catch(ArithmeticException e){
        System.out.println("You can't divide by zero! IDIOT!");
    }
    catch (InputMismatchException e){
        System.out.println("PLEAS ENTER A NUMBER OMFG!!!");
    }
    catch (Exception e){
        System.out.println("Something went wrong");
    }
    finally {
        scanner.close();
    }
}
}