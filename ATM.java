import java.util.Scanner;

class ATM{
    public static void main(String[] args) {
       Machine user1 = new Machine();
       user1.checkPin(); 


    }
}

class Machine{
    double balance ;
    int PIN = 4468;

    public void checkPin(){
        System.out.println("Please enter your pin");
        Scanner input = new Scanner(System.in);
         int entredPin = input.nextInt();

         if(entredPin == PIN){
            menu();
         }else{
            System.out.println("Invalid pin");
            checkPin();
         }

    }

    public void menu(){
        System.out.println("Enter your choice");
        System.out.println("1. Check Balance.");
        System.out.println("2. Withdraw money");
        System.out.println("3. Deposit money");
        System.out.println("4. Exit.");

        Scanner in = new Scanner(System.in);
        int option = in.nextInt();

        switch (option) {
            case 1: checkBalance();
                break;
        
            case 2: WithdrawMoney();
              break;

              case 3: DepositMoney();
              break;

              case 4: System.exit(0);
              break;
            default: System.out.println("Please enter a valid Choice");
                break;
        }

    }

    public void checkBalance(){
        System.out.println("Balance: " + balance);
        menu();
    }

    public void WithdrawMoney(){
        System.out.println("Enter the Amount you want to withdraw");
        Scanner in = new Scanner(System.in);
        double amount = in.nextDouble();

        if(amount>balance){
            System.out.println("you have insufficient funds.");
        }else{
            System.out.println("money withdrawn successfully");
            balance = balance - amount;
            System.out.println("Balance: " + balance);
        }
        menu();
    }

    public void DepositMoney(){
        System.out.println("Enter the amount you want to deposit.");
        Scanner in = new Scanner(System.in);
        double amount = in.nextDouble();
    
        if(amount>=1){
              System.out.println("Amount deposit successful");
              balance = balance+amount;
              System.out.println("Balance " + balance);
        }else{
            System.out.println("Please enter a valid amount");
        }
           menu();
    }
}