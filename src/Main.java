import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> products = new ArrayList<String>();
        ArrayList<Double> prices = new ArrayList<Double>();
        ArrayList<String> purchases = new ArrayList<String>();
        products.add("Red Hot Spice Doritos");
        prices.add(2.99);
        products.add("Cool Ranch Doritos");
        prices.add(2.99);
        products.add("Coke");
        prices.add(0.99);
        products.add("Diet Coke");
        prices.add(0.99);
        products.add("Pepsi");
        prices.add(0.99);
        products.add("Five Hour Energy");
        prices.add(3.99);
        products.add("Sunflower Seeds");
        prices.add(0.99);
        products.add("Peanuts");
        prices.add(0.99);
        products.add("MacBook Chargers");
        prices.add(120.0);
        products.add("Dell Chargers");
        prices.add(50.0);
        
    String answer = "";
        do {
        System.out.println("What do you want to do?");
        System.out.println("1) add purchase 2) change purchase 3) show purchases 4) finish transaction");
        answer = input.nextLine();
        if (answer.equals("1")) {
            System.out.println("What do you wish to buy?");
            answer = input.nextLine();
            purchases.add(answer);
        }
        if (answer.equals("2")) {
            System.out.println("What do you want to change?");
            answer = input.nextLine();
            purchases.remove(answer);
            System.out.println("To what?");
            answer = input.nextLine();
            purchases.add(answer);




        }
        if (answer.equals("3")) {
            for (int w = 0; w < purchases.size(); w++) {
                System.out.println(purchases.get(w));
            }
        }
    } while (!answer.equals("4"));

    double totalcost = 0.0;
    int j = 0;
        for (int i = 0; i < purchases.size(); i++) {
        do {
            // condition is check if the value in purchases at position i is equal to the value in products at position j
            if (purchases.get(i).equals(products.get(j))) {
                // increment totalcost with the ith value in the prices array
                totalcost += prices.get(i);
            }
            j++;
        } while (j < products.size());
        if (answer.equals("4")) {
            System.out.println(totalcost);

        }
    }
}
}