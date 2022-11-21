public class Account {
    int accno;
    int balance;
    int roi;
    static int noDefaulters;
    static Account[] people = new Account[500];
    static int no;
    public Account() {
        people[no++] = this;
    }

    public Account(int accno, int balance) {
        this.accno = accno;
        this.balance = balance;
        people[no++] = this;
    }

    static void deposit(int amount, int accno){
        for (int i = 0; i < no; i++) {
            if (people[i].accno == accno){
                people[i].balance += amount;
            }
        }
    }

    static void withdraw(int amount, int accno){
        for (int i = 0; i < no; i++) {
            if (people[i].accno == accno){
                people[i].balance -= amount;
            }
        }
    }

    static int checkBalance(int accno){
        for (int i = 0; i < no; i++) {
            if (people[i].accno == accno){
                System.out.println(people[i].balance);
                return people[i].balance;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accno=" + accno +
                ", balance=" + balance +
                ", roi=" + roi +
                '}';
    }

    static void display(){
        for (int i = 0; i < no; i++) {
            if (people[i].balance < 1000){
                System.out.println(people[i].toString());
            }
        }
    }
}
