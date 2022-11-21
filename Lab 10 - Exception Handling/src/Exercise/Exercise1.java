package Exercise;
import java.util.*;

class InvalidInitialTemperatureException extends Exception{
    private int temp;
    InvalidInitialTemperatureException(int temp) {
        this.temp = temp;
    }
    public String toString() {
        return "InvalidInitialTemperatureException : "+this.temp;
    }
}

class HighTemperatureException extends Exception{
    HighTemperatureException() {}
    public String toString() {
        return "\nHigh Temperature Exception : Cooling down\n";
    }
}

class LowTemperatureException extends Exception{
    LowTemperatureException() {}
    public String toString() {
        return "\nLow Temperature Exception : Heating\n";
    }
}

class Thermostat{
    private int temperature;
    static final int LOWER_LIM = 50;
    static final int UPPER_LIM = 100;
    Thermostat(int initTemp) throws InvalidInitialTemperatureException{
        if((initTemp>=LOWER_LIM)&&(initTemp<=UPPER_LIM)){
            this.temperature=initTemp;
            System.out.println("Thermostat     Starting.     With     Initial     Temprature :"+temperature);
        }else{
            throw new InvalidInitialTemperatureException(initTemp);
        }
    }

    public void startThermostat() throws HighTemperatureException{
        System.out.println("*****************Thermostat Started*************************");
        this.temperature++;

        if (this.temperature>=UPPER_LIM){
            throw new HighTemperatureException();
        }
    }
    public void stopThermostat() throws LowTemperatureException{
        System.out.println("*****************Thermostat Stopping*************************");
        this.temperature--;
        if (this.temperature <= LOWER_LIM){
            throw new LowTemperatureException();
        }
    }
}
public class Exercise1 {
    public static void main(String[] args) throws InvalidInitialTemperatureException{
        Thermostat t=new Thermostat(55); //Setting the initial temperature of the thermostat as 55.
         while(true){
             try{
                 t.startThermostat();
             }catch(HighTemperatureException e) {
                 System.out.println(e);
             }try{
                 t.stopThermostat();
             }catch(LowTemperatureException ex) {
                 System.out.println(ex);
             }
         }
    }
}

