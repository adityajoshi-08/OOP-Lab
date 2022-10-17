package Exercise;

//Exercie 3.1
class RetailStore{
    private int[] itemId;
    private double[] price;
    private String itemName[];
    public RetailStore() {
        itemId = new int[] { 1001, 1002, 1003, 1004, 1005 };
        price = new double[] { 950.00, 750.00, 450.00, 350.00, 250.00 }; itemName = new String[] {
                "Yonex Tennis Racket-950","Yonex Badminton Racket-750",
                "Silvers Badminton Racket-450","Cosco Badminton shuttle-350",
                "Cosco Tennis Racket-250" };
    }

    protected double computePrice(int value) {
        for (int i = 0; i<price.length; ++i){
            if (itemId[i] == value) {
                return price[i];
            }
        }
        return price[value];
    }

    protected String fetchDescription(int value) {
        for (int i = 0; i<price.length; ++i) {
            if (itemId[i] == value) {
                return itemName[i];
            }
        }
        return null;
    }
}

public class RetailStoreExample extends RetailStore{
    public static void main(String[] args) {
        int index;
        RetailStore retailOne = new RetailStore();
        String description = retailOne.fetchDescription(1004);
        String StringArray[];
        StringArray = description.split("\\s");
        String type = StringArray[2];
        index = type.indexOf('-');
        String stringFromSubstring = type.substring(index + 1);
        String stringFromDouble = Double.toString(new RetailStore().computePrice(1004));

        System.out.println(stringFromDouble == stringFromDouble);
        System.out.println(stringFromDouble.equals(stringFromDouble));
    }
}