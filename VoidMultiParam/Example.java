package VoidMultiParam;

public class Example {
    public static void main(String args[]){
        heyTaxi("Bahamas", 1000.05);
    }

    public static void heyTaxi(String location, double cash){
        System.out.println("The taxi will take you to " + location);
        System.out.println("It will cost " + cash);
    }

}
