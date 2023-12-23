import java.util.*;

public class ATM{
    static double blance = 200.00;
    static int count = 0;
    public static void Verify() {
        int pin = 2005;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your 4- digit pin");
        int code = sc.nextInt();
        if(code == pin){

            manu();
            return;
        }
        System.out.println("************INCORRECT PIN**************\nPlease try again");
        count++;
        
        System.out.println(count);
        if(count == 3 && pin!= code){
        System.out.println("YOUR ATTEMP ARE OVER PLEASE TRY AGAIN AFTER 24 HRS.");
        Exit();
        return;

        }
        Verify();
        
    }
    public static void manu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select any one of them");
        System.out.println("1.Check blance\n2.Withdraw\n3.Deposit\n4.Exit");
        int option = sc.nextInt();
        switch (option) {
            case 1:
            CheckBlance();
            break;
            case 2:
            withdraw();
            break;
            case 3:
            Deposit();
            break;
            case 4:
            Exit();
            break;
            default:
            System.out.println("*************ERROR:405*************\nInvalid option please try again");
            break;
            
        }

    }
    public static void CheckBlance() {
        System.out.println("YOUR CURRNT BLANCE IS: $"+blance);
        
    }
    public static void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdraw");
        int amount = sc.nextInt();
        if(amount<blance){
            blance-=amount;
            System.out.println("$"+amount+" has withdraw");
            CheckBlance();
        }else{
            System.out.println("**********ERROR:309************\nNOT EOUGHT BLANCE TO WITHDRAW");
        }
        
    }
    public static void Deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount to deposit");
        int amount = sc.nextInt();
        System.out.println("$"+amount+" has been deposit");
        blance+=amount;
        CheckBlance();
        
    }
    public static void Exit() {
        System.out.println("****************THANK YOU****************");
        return;
    }
    public static void main(String[] args) {
        int count =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("*************** WELLCOME DEAR USER *******************\n");
        System.out.println("please select your langunge");
        System.out.println("1.English\n2.Hindi");
        int langunge= sc.nextInt();
        if(langunge == 1){
            System.out.println("please enter any two number between 10 to 99 to verify you are not a robot");
            int num = sc.nextInt();
            if(num>=10 && num<= 99){
                Verify();
            }else{
                System.out.println("************ERROR: 405**************\nPLEASE ENTER VALID NUMBER");
            }
        }else if(langunge == 2){
            System.out.println("SORRY CURRENTLY THIS LANGUNGE IS NOT AVAILABLE");
        }else{
            System.out.println("************ERROR:405***********\nINVALID NUMBER PLEASE TRY AGAIN");
        }

    }
}