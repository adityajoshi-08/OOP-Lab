package classDesignBasics;
// lab 2.1

public class Item {
     private String itemName;
     private String itemIdNo;
     private int itemQuantity;
     private double itemPrice;

    public Item(String itemName, String itemIdNo, int itemQuantity, double itemPrice) {
        this.itemName = itemName;
        this.itemIdNo = itemIdNo;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
    }

    public Item(String itemName, String itemIdNo, int itemQuantity) {
        this.itemName = itemName;
        this.itemIdNo = itemIdNo;
        this.itemQuantity = itemQuantity;
    }

    public Item(String itemName, String itemIdNo) {
        this.itemName = itemName;
        this.itemIdNo = itemIdNo;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemIdNo() {
        return itemIdNo;
    }

    public void setItemIdNo(String itemIdNo) {
        this.itemIdNo = itemIdNo;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
}
