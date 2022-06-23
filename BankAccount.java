public class BankAccount {
    String account_number;
    String aadhar_number;
    String owner_name;
    double ROI;
    double balance;
    boolean account_status = false;

    BankAccount() {

    }

    BankAccount(String account_number, String aadhar_number, String owner_name) {
        this.account_number = account_number;
        this.aadhar_number = aadhar_number;
        this.owner_name = owner_name;
        this.account_status=true;

        System.out.println("\n\nCongartulations !!! \nYour New Account is ready for Transactions\n\n");
    }

    void openAccount(String owner_name, String aadhar_number) {

        String acc_num = "";
        for (int i = 0; i < 8; i++) {
            int xnum = (int) ((Math.random() * 10));
            acc_num = acc_num + Integer.toString(xnum);
        }

        this.balance = 0;
        this.account_status = true;

    }

    void deposit(double amount) {
        if(this.account_status==false){
            System.out.println("Account was Closed.....");
            System.out.println("Please Open New Account for Transactions !!\n\n");
            return;
        }

        System.out.println("\nAdding Rs " + amount + " to your Account\n");
        this.balance += amount;
        System.out.println("Current Balance Available : " +  this.balance);
    }

    void display_account() {

        System.out.println("-------------------Account Details-------------------");
        System.out.println();
        System.out.println("Account Owner : " + this.owner_name);
        System.out.println("Available Balance : " + this.balance + " Rs");
        System.out.println("Account Number : " + this.account_number);
        System.out.println("Account Status : " + (this.account_status==true?" Active":" Closed"));
        System.out.println("Account ROI : " + this.ROI);
        System.out.println("-----------------------------------------------------");
        System.out.println();

    }

}