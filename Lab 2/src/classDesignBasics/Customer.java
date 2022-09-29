package classDesignBasics;

// Question 2.2

public class Customer {
    private String name;
    private String idNo;
    private double balance;
    private Item item;

    public Customer(String name, String idNo, double balance) {
        this.name = name;
        this.idNo = idNo;
        this.balance = balance;
    }

    public Customer(String name, String idNo) {
        this.name = name;
        this.idNo = idNo;
        this.balance = 5000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public double getBalance() {
        return balance;
    }


    public Item getItem() {
        return item;
    }

    public void print(){
        System.out.println("Item name "+ this.item.getItemName());
        System.out.println("Item idNo "+ this.item.getItemIdNo());
        System.out.println("Item quantity "+ this.item.getItemQuantity());
        System.out.println("Item price "+ this.item.getItemPrice());
    }

    public void buyItem(Item item){
        if (item.getItemQuantity() < 1){
            System.out.println("Invalid purchase");
        } else{
            if (this.balance >= (item.getItemQuantity()* item.getItemPrice())){
                this.item = item;
                print();
            } else{
                System.out.println("Insuffiecient balance");
            }
        }
    }


}
