import java.util.Arrays;

public class Account {
    //    Attributes
    int accNo;
    int balance;
    int roi;
    static int noDefaulters = 0;
    static Account[] people = new Account[500];
    static int noOfPeople;

    //    Constructors
    public Account() {
        updateDefaulters();
        people[noOfPeople++] = this;
    }

    public Account(int accNo, int roi) {
        if (checkAccountValidity() == 0){
            this.accNo = accNo;
            this.roi = roi;
            people[noOfPeople++] = this;
            updateDefaulters();
        } else{
            System.out.println("Account already exists");
        }
    }

    void deposit(int amount){
        this.balance += amount;
        updateDefaulters();
    }

    void withdraw(int amount){
        if (this.balance > amount){
            this.balance -= amount;
        } else{
            System.out.println("Insufficient balance");
        }
        updateDefaulters();
    }

    int checkBalance(){ return this.balance;}

    static void display(){
        for (int i = 0; i < noOfPeople; i++) {
            if (people[i].balance < 1000){
                 System.out.println(people[i].toString());
            }
        }
    }
    @Override
    public String toString() {
        return "Account{" +
                "accNo=" + accNo +
                ", balance=" + balance +
                ", roi=" + roi +
                '}';
    }

    static int updateDefaulters(){
        int temp = 0;
        for (int i = 0; i < noOfPeople; i++) {
            if (people[i].balance < 1000){
                temp++;
            }
        }
        noDefaulters = temp;
        return temp;
    }

    int checkAccountValidity(){
        int flag = 0;
        for (int i = 0; i < noOfPeople; i++) {
            if (accNo == people[i].accNo){
                flag = 1;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Account a1 = new Account(219302415, 5);
        Account a2 = new Account(219302415, 5);
        Account a3 = new Account(219302417, 5);
        Account a4 = new Account(219302418, 5);
        Account a5 = new Account(219302419, 5);
        a2.deposit(50000);
        System.out.println(noDefaulters);

        a1.deposit(-10000);
        System.out.println(noDefaulters);

        a1.withdraw(9100);
        System.out.println(noDefaulters);

        System.out.println(a1.checkBalance());

        display();
    }

}

