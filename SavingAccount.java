public class SavingAccount extends BankAccount {

    SavingAccount() {
    }

    SavingAccount(String account_number, String aadhar_number, String owner_name) {
        super(account_number, aadhar_number, owner_name);
        this.ROI = 4;
    }

    void updateInterest(int year) {

        if(this.account_status==false){
            System.out.println("Account was Closed.....");
            System.out.println("Please Open New Account for Transactions !!\n\n");
            return;
        }

        if (year > 0) {
            this.ROI = 4;
            this.balance = (this.ROI / 100) * this.balance;
            System.out.println("Interest Updated");
        } 
        else {
            System.out.println("Invalid Year");            
        }
    }


    void closeAccount() {
        this.account_status = false;
    }


    void withdraw(double amount) {


        if(this.account_status==false){
            System.out.println("Account was Closed.....");
            System.out.println("Please Open New Account for Transactions !!\n\n");
            return;
        }

        if(amount>this.balance){
            System.out.println("Not Sufficient Amount Present in Account");
            System.out.println("Balance Available : " +  this.balance);
        }
        else{
            this.balance-=amount;
            System.out.println("Debited Rs " + amount + " from your Account\n");
            System.out.println("Current Balance Available : " +  this.balance);
        }

    }

}
