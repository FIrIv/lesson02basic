package test.skypro;

public class Main {

    public static void main(String[] args) {
        byte shopCount = 50;
        short officeWorkersCount = 100;
        int shopWorkersCount = 1000;
        long shopItemsCount = 25000L;
        float timeBetweenShipment1 = 3.5f;
        double timeBetweenShipment2 = 7.0 / 3.0;
        char shopName = 'S';
        boolean shopActive = true;

        float weightBoxer1 = 78.2f;
        float weightBoxer2 = 82.7f;
        float weightBoxers = weightBoxer1 + weightBoxer2;
        System.out.println ("Общий вес борцов " + weightBoxers + "кг");
        float weightBetweenBoxers = weightBoxer2 - weightBoxer1;
        System.out.println ("Разница в весе между боксерами " + weightBetweenBoxers + "кг");
        System.out.println();

        short bananaGramm = 80;
        short milkGramm = 105;
        short iceCreamGramm = 100;
        short aggGramm = 70;
        int bananas = 5 * bananaGramm;
        int milk = 200 / 100 * milkGramm;
        int iceCream = 2 * iceCreamGramm;
        int aggs = 4 * aggGramm;
        int gToKg = 1000;
        int breakfastGramm = bananas + milk + iceCream + aggs;
        float breakfastKg = breakfastGramm / (float)gToKg;
        System.out.println("Завтрак спортсмена: " + breakfastGramm + "г");
        System.out.println("Завтрак спортсмена: " + breakfastKg + "кг");
        System.out.println();

        short weightDownMin = 250;
        short weightDownMax = 500;
        short weightDownKg = 7;
        int dayForWeightDownMin = weightDownKg * gToKg / weightDownMin;
        int dayForWeightDownMax = weightDownKg * gToKg / weightDownMax;
        float weightDownMiddle = (weightDownMin + weightDownMax)/2f;
        float DayForWeightDownMiddle = weightDownKg * gToKg / weightDownMiddle;
        System.out.println("Если худеть по 250г в день, спортсмену понадобится " + dayForWeightDownMin + " дней для похудения. ");
        System.out.println("Если худеть по 500г в день, спортсмену понадобится " + dayForWeightDownMax + " дней для похудения. ");
        System.out.println(DayForWeightDownMiddle + " дней для похудения понадобится спортсмену в среднем (ср.вес похудения " + weightDownMiddle + "г/день). ");
        System.out.println();

        int MashaSalary = 67_760;
        int DenisSalary = 83_690;
        int KristinaSalary = 76_230;
        float SalaryUpKoef = 0.1f;
        float MashaSalaryAfter = MashaSalary * (1+SalaryUpKoef);
        float DenisSalaryAfter = DenisSalary * (1+SalaryUpKoef);
        float KristinaSalaryAfter = KristinaSalary * (1+SalaryUpKoef);
        float MashaSalaryUp = MashaSalaryAfter - MashaSalary;
        float DenisSalaryUp = DenisSalaryAfter - DenisSalary;
        float KristinaSalaryUp = KristinaSalary * SalaryUpKoef;
        System.out.println("Маша теперь получает " + MashaSalaryAfter + " рублей. Годовой доход вырос на " + MashaSalaryUp*12 + " рублей.");
        System.out.println("Денис теперь получает " + DenisSalaryAfter + " рублей. Годовой доход вырос на " + DenisSalaryUp*12 + " рублей.");
        System.out.println("Кристина теперь получает " + KristinaSalaryAfter + " рублей. Годовой доход вырос на " + KristinaSalaryUp*12 + " рублей.");
        System.out.println();
    }
}
