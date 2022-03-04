package test.skypro;

public class Main {

    public static void main(String[] args) {
        byte shopCount = 50;
        short officeWorkersCount = 100;
        int shopWorkersCount = 1000;
        long shopItemsCount = 25000L;
        float timeBetweenShipment1 = 3.5f;
        double timeBetweenShipment2 = 2.3333333333;

        float weightBoxer1 = 78.2f;
        float weightBoxer2 = 82.7f;
        float weightBoxers = weightBoxer1 + weightBoxer2;
        System.out.println ("Общий вес борцов " + weightBoxers);

        float weightBetweenBoxers = weightBoxer2 - weightBoxer1;
        System.out.println ("Разница в весе между боксерами " + weightBetweenBoxers);

        
    }
}
