package ReturnMultiParam;
public class Example {
    public static void main(String args[]){
        System.out.println("You are traveling from Tatooine to Mustafar, a far distance.");
        System.out.println("This is a 53000 light year trip.");
        // 2 minute per light year on our estimate.
        System.out.println("It will take you " + StarWars.r2Estimate(53000.0) + " hours.");

    }
}
