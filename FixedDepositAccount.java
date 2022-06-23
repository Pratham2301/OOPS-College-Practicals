public class FixedDepositAccount extends BankAccount {

    int lockInPeriod;

    FixedDepositAccount() {
    }

    FixedDepositAccount(String account_number, String aadhar_number, String owner_name, int amount, int lockInPeriod) {
        super(account_number, aadhar_number, owner_name);
        this.balance=amount;
        this.ROI = 0;
        this.lockInPeriod = lockInPeriod;

    }

    void updateInterest(int year) {

        if(this.account_status==false){
            System.out.println("Account was Closed.....");
            System.out.println("Please Open New Account for Transactions !!\n\n");
            return;
        }

        if (year > 0 && year <= 2) {
            this.ROI = 6;
        } 
        else if (year > 2 && year <= 5) {
            this.ROI = 6.5;
        } 
        else if (year > 5) {
            this.ROI = 7;
        } 
        else {
            System.out.println("Invalid Year");
            return;
        }

        this.balance += (this.ROI / 100) * this.balance;

        System.out.println("Interest Updated");
    }


    void closeAccount(int year) {

        if(year < this.lockInPeriod){
            this.balance = this.balance-((5/100)*(this.balance));
            System.out.println("Account Closed Before Lockin Period");
            System.out.println("Deducting 5% from Balance...\n\n");
        }

        System.out.println("Account Closed Succesfully !!!\n");

        this.account_status = false;
    }

    void display_account() {

        System.out.println("-------------------Account Details-------------------");
        System.out.println();
        System.out.println("Account Owner : " + this.owner_name);
        System.out.println("Available Balance : " + this.balance + " Rs");
        System.out.println("Account Number : " + this.account_number);
        System.out.println("Account Status : " + (this.account_status==true?" Active":" Closed"));
        System.out.println("Account ROI : " + this.ROI);
        System.out.println("Account LockinPeroid : " + this.lockInPeriod);
        System.out.println("-----------------------------------------------------");
        System.out.println();

    }

}
