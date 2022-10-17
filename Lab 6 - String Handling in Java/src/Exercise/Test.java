package Exercise;

import java.util.Arrays;
import java.util.Objects;

class Address{
    String line1;
    String line2;
    String line3;
    char[] city;
    char[] state;
    String pin;

    public Address(String parameter){
        String[] stringArray = parameter.split("\\$");

        this.line1 = stringArray[0];
        this.line2 = stringArray[1];
        this.line3 = stringArray[2];
        this.city = stringArray[3].toCharArray();
        this.state = stringArray[4].toCharArray();
        this.pin = stringArray[5];
    }

    void print(){
        System.out.println(this.line1 + " " + this.line2+ " " + this.line3+ " " + Arrays.toString(this.city)
                + " " + Arrays.toString(this.state) + " " + this.pin);
    }
}

class AddressList{
    public static int countAddressWithCity(Address[] addressList, String city){
        int result = 0;
        for (int i = 0; i < addressList.length; i++) {
            if (String.valueOf(addressList[i].city).equals(city)){
                result++;
            }
        }
        if (addressList.length == 0 || city.length() == 0){
            return -1;
        }
        return result;
    }

    public static int countAddressWithPin(Address[] addressList, String strP){
        int result = 0;
        for (int i = 0; i < addressList.length; i++) {
            if (Objects.equals(addressList[i].pin, strP)){
                result++;
            }
        }
        if (addressList.length == 0 || strP.length() == 0){
            return -1;
        }
        return result;
    }

    public static Address[] getAddressWithCity(Address[] addressList, String city){
        Address[] resultArray = new Address[addressList.length];
        int resultCount = 0;
            for (int i = 0; i < addressList.length; i++) {
                String city1 = new String(addressList[i].city);
                if (city1.equals(city)){
                    resultArray[resultCount++] = addressList[i];
                }
            }
            if (resultCount == 0 || addressList.length == 0 || city.length() == 0){
                return null;
            }
            return resultArray;
    }

    public static Address[] getAddressWithPin(Address[] addressList, String strP){
        Address[] resultArray = new Address[addressList.length];
        int resultCount = 0;
        for (int i = 0; i < addressList.length; i++) {
            if (addressList[i].pin.equals(strP)){
                resultArray[resultCount++] = addressList[i];
            }
        }
        if (resultCount == 0 || addressList.length == 0 || strP.length() == 0){
            return null;
        }
        return resultArray;
    }
}



public class Test {
    public static void main(String[] args) {
        Address x = new Address("line1$line2$line3$city$state$pin");
        Address y = new Address("line1$line2$line3$city$state$pin");
        Address[] addressList = {x,y};

        System.out.println(AddressList.countAddressWithCity(addressList, "city"));
        System.out.println(AddressList.countAddressWithPin(addressList,"pin"));

        System.out.println("city");
        Address[] getAddressByCity = AddressList.getAddressWithCity(addressList, "city");
        for (int i = 0; i < getAddressByCity.length; i++) {
            getAddressByCity[i].print();
        }

        Address[] getAddressByPin = AddressList.getAddressWithPin(addressList, "pin");
        for (int i = 0; i < getAddressByPin.length; i++) {
            getAddressByPin[i].print();
        }

    }
}
