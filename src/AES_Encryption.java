import java.util.InputMismatchException;
import java.util.Scanner;

public class AES_Encryption {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int choice = 0;
        System.out.println("Welcome to the AES encryption program.\n");
        do{
            try {
                System.out.println("Please select one of the following options:");
                System.out.println("1. Encrypt file\t2. Decrypt file\t3. Exit menu");
                choice = keyboard.nextInt();
                if (choice == 1) {
                    System.out.println("Encryption mode initiated");
                } else if (choice == 2) {
                    System.out.println("Decryption mode initiated");
                } else if (choice == 3) {
                    System.out.println("Exiting menu...");
                    System.out.println("Goodbye!");
                } else {
                    throw new IllegalArgumentException("Invalid option");
                }
            }catch(IllegalArgumentException e){//doesn't need to clean the scanner because the value has been read
                    System.out.println(e.getMessage());
                }
            catch(InputMismatchException e){//needs to clean scanner because occurs before the Scanner successfully reads it asi que el valor se queda "flotandop" o voland osin salir
                System.out.println("Error occurred. Please enter a valid menu option");
                keyboard.nextLine();
            }
            }


        while(choice !=3);


    }
}
