public class Test {
    public static void main(String[] args) {

        System.out.println();
        System.out.println();
        System.out.println();

        FixedDepositAccount fd1 = new FixedDepositAccount("Acc-101","Adhar-101","Owner-101",1000,5);

        
        fd1.display_account();

        fd1.updateInterest(1);
        fd1.updateInterest(2);
        fd1.updateInterest(3);
        
        fd1.deposit(1000);

        fd1.updateInterest(4);

        fd1.display_account();

        fd1.closeAccount(2);

        fd1.display_account();

        fd1.deposit(600);

        SavingAccount sa1=new SavingAccount("Acc-201","Adhar-201","Owner-201");

        sa1.display_account();

        sa1.deposit(1000);

        sa1.withdraw(400);

        sa1.display_account();

        sa1.closeAccount();

        sa1.withdraw(200);

        sa1.display_account();

    
    }
    
}
