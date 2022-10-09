import java.util.Scanner;
public class midterm_coin_names_switch_case {
    public static void main(String[] args)
    {
        int coin;
        Scanner kb=new Scanner (System.in);
        System.out.print("Enter a number for coin values: ");
        coin=kb.nextInt();


        switch (coin)
        {
            case (1): {
                System.out.println("This is one cent known as a penny");
                break;
            }
            case (5): {
                System.out.println("This is 5 cents known as a nickel");
                break;
            }
            case (10): {
                System.out.println("This is 10 cents known as a dime");
                break;
            }
            case (25): {
                System.out.println("This is 25 cents known as a quarter");
                break;
            }
            default: {
                System.out.println("Sorry, I don't have a name for that one.");

            } }
    }}

    /*
Enter a number for coin values: 5
This is 5 cents known as a nickel

Enter a number for coin values: 25
This is 25 cents known as a quarter
     */