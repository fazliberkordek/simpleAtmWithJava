/**
 * @author fazliberkordek
 */
// Simple Atm project:

import java.util.Scanner;

/*todo:
    1-Take users name and password
    2-If the user fails  3 times to log in , the account will be blocked
    3-If the account log in successfull than this options will be available to user:
        -Balance check
        -Deposit
        -Withdraw
    4- If the input is invalid the program will shut down.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the ATM");

        //1- userName and password (is string);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {

            String userName, password;
            System.out.print("User's name: ");
            userName = input.nextLine();
            System.out.print("User's Password: ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Succesfuuly logged it...Welcome to X bank ");
                do {
                    System.out.println("1-Deposit\n" + "2-Withdrawel:\n" + "3- Balance report:\n" + "4-Quit");
                    System.out.println("Please select the thing you want to do ...");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.println("Amount Money : ");
                        int price = input.nextInt();
                        balance += price;

                    } else if (select == 2) {
                        System.out.println("Amount of money : ");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("You do not have enough bank balance!!");
                        } else {
                            balance -= price;
                        }
                    } else if (select == 3) {
                        System.out.println("Balance : " + balance);
                    }

                } while (select != 4);
                System.out.println("See you soon...");
                break;
            } else {
                right--;
                System.out.println("Wrong user name or password");
                if (right == 0) {
                    System.out.println("Your account has been banned please contact to the bank");
                } else {
                    System.out.println("You have .." + right + " chance left");
                }

            }
        }
    }
}