public class Main
{
    public static void Task1()
    {
        System.out.println("Task1: ");
        int i = 32;
        byte b = 126;
        short s = 4;
        long l = 321L;
        float f = 87.23f;
        double d = 533.08;
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);
        System.out.println("##########");
    }

    public static void Task2()
    {
        System.out.println("Task2: ");
        double d = 27.12;
        long l = 987678965549L;
        float f = 2.786f;
        short s1 = 569;
        short s2 = -159;
        int i = 27897;
        byte b = 67;
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s1 с типом short равно " + s1);
        System.out.println("Значение переменной s2 с типом short равно " + s2);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);
        System.out.println("##########");
    }

    public static void Task3()
    {
        System.out.println("Task3: ");
        int studentLP = 23;
        int studentAS = 27;
        int studentEA = 30;
        int paper = 480;
        System.out.println("На каждого ученика рассчитано \'" + (480 / (23 + 27 + 30)) + "\' листов бумаги.");
        System.out.println("##########");
    }

    public static  void Task4()
    {
        System.out.println("Task4: ");
        final byte BOTTLES_IN_ONE_MINUTE = 16 / 2;
        short bottlesInTwentyMinutes = BOTTLES_IN_ONE_MINUTE * 20;
        int bottlesInOneDay = BOTTLES_IN_ONE_MINUTE * 60 * 24;
        int bottlesInThreeDay = bottlesInOneDay * 3;
        int bottlesInOneMonth = bottlesInOneDay * 30;
        System.out.println("За 20 минут машина произвела \'" + bottlesInTwentyMinutes + "\' штук бутылок");
        System.out.println("За одни сутки машина произвела \'" + bottlesInOneDay + "\' штук бутылок");
        System.out.println("За 3 для машина произвела \'" + bottlesInThreeDay + "\' штук бутылок");
        System.out.println("За 1 месяц машина произвела \'" + bottlesInOneMonth + "\' штук бутылок");
        System.out.println("##########");
    }

    public static  void Task5()
    {
        System.out.println("Task5: ");
        byte cansOfPaint = 120;
        int numberOfClasses = cansOfPaint / (2 + 4);
        int cansOfWhitePaint = numberOfClasses * 2;
        int cansOfBrownPaint = numberOfClasses * 4;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + cansOfWhitePaint + " банок белой краски и " + cansOfBrownPaint + " банок коричневой краски.");
        System.out.println("##########");
    }

    public static  void Task6()
    {
        System.out.println("Task6: ");
        int gramsInBanana = 80;
        int gramsInMilk100 = 105;
        int gramsInIceCream = 100;
        int gramsInEggs = 70;
        int totalWeightInGrams = (5 * gramsInBanana) + (2 * gramsInMilk100) + (2 * gramsInIceCream) + (4 * gramsInEggs);
        float totalWeightInKilograms = (float) totalWeightInGrams / 1000;
        System.out.println("Общий вес завтрака в граммах - " + totalWeightInGrams + "\nОбщий вес завтрака в килограммах - " + totalWeightInKilograms);
        System.out.println("##########");
    }

    public static  void Task7()
    {
        System.out.println("Task7: ");
        short dayMinWeights = 7000 / 250;
        short dayMaxWeights = 7000 / 500;
        //short dayAverageWeights = (short)Math.ceil(7000f / ((250f + 500f) / 2)); // использовал математический класс для сокращения до целых
        short dayAverageWeights = 7000 / ((250 + 500) / 2);
        short remainsDayAverageWeights = (short)(24 * ((7000 % ((250 + 500) / 2)) / 1000f));
        System.out.println(dayMinWeights + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм.");
        System.out.println(dayMaxWeights + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм.");
        System.out.println(dayAverageWeights + " дней и " + remainsDayAverageWeights + " часов уйдет на похудение, если спортсмен будет терять каждый день в среднем.");
        System.out.println("##########");
    }

    public static  void Task8()
    {
        System.out.println("Task5: ");
        int newSalaryMasha = (int)(67760 * 1.1f);
        int newSalaryDenis = (int)(83690 * 1.1f);
        int newSalaryKristina = (int)(76230 * 1.1f);
        int growthIncomeMasha = (int)(67760 * 0.1f);
        int growthIncomeDenis = (int)(83690 * 0.1f);
        int growthIncomeKristina = (int)(76230 * 0.1f);
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + growthIncomeMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + growthIncomeDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рубля. Годовой доход вырос на " + growthIncomeKristina + " рубля");
        System.out.println("##########");
    }
    public static void main(String[] args)
    {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
        Task8();
    }
}