public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        byte b = 2;
        System.out.println(" Значение переменной с типом byte равно " + b);
        short c = 159;
        System.out.println(" Значение переменной с типом short равно " + c);
        int a = 200;
        System.out.println(" Значение переменной с типом int равно " + a);
        long d = 9838940L;
        System.out.println(" Значение переменной с типом long равно " + d);
        float e = -3.08f;
        System.out.println(" Значение переменной с типом float равно " + e);
        double f = 1.2;
        System.out.println(" Значение переменной с типом double равно " + f);



        byte g = 67;
        int h = -159;
        int j = 569;
        short k = 27897;
        long l = 987678965549L;
        float o = 27.12f;
        double p = 2.786;


        byte lyudmilaPav = 23;
        byte annaSer = 27;
        byte ekaterinaA = 30;
        short paper = 480;
        int klass = lyudmilaPav + annaSer + ekaterinaA;
        int paperPerPeople = paper / klass;
        System.out.println("На каждого ученика рассчитано " + paperPerPeople + " листов бумаги ");



        byte machine = 16;
        int machine1Min = machine / 2;
        int machine20min = machine1Min * 20;
        System.out.println("За 20 минут машина произвела " + machine20min + " штук бутылок ");
        int machine1Day = machine1Min * 1440;
        System.out.println(" За сутки машина произвела " + machine1Day + " штук бутылок ");
        int machine3Days = machine1Day * 3;
        System.out.println(" За трое суток машина произвела " + machine3Days + " штук бутылок ");
        int months = machine1Day * 30;
        System.out.println(" За месяц машина произвела " + months + " штук бутылок ");



        byte white = 2;
        byte brown =  4;
        int colours = 120;
        int total = white + brown;
        System.out.println(total);
        int colourKlass = 120 / total;
        System.out.println(colourKlass);
        int totalWhite = white * colourKlass;
        int totalBrown = brown * colourKlass;
        System.out.println(" В школе, где " + colourKlass + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски " );



        int banana = 5 * 80;
        int milk = (200 / 100) * 105;
        int iceCream = 2 * 100;
        int egg = 4 * 70;
        int mix = banana + milk + iceCream + egg;
        double totalKg = mix / 1000.0;
        System.out.println(" Завтрак спорстменов " + totalKg );



        int lossWeight = 7 * 1000;
        int minGram = 250;
        int maxGram = 500;
        int ifMinDay = lossWeight / minGram;
        int ifMaxDay = lossWeight / maxGram;
        int average = (ifMinDay + ifMaxDay)/2;
        System.out.println(" если спортсмен будет терять каждый день по 250 грамм " + ifMinDay + " дней ему понадобится " ) ;
        System.out.println(" если спорстмен будет терять каждый день по 500 грамм " + ifMaxDay + " дней ему понадобится " ) ;
        System.out.println(" в среднем понадобится " + average + " дней ");


        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        int percentMasha = (Masha / 100)* 10;
        int percentDenis = (Denis / 100)* 10;
        int percentKristina = (Kristina / 100)* 10;
        int upMasha = percentMasha + Masha;
        int upDenis = percentDenis + Denis;
        int upKristina = percentKristina + Kristina;
        int yearMasha = upMasha * 12;
        int yearDenis = upDenis * 12;
        int yearKristina = upKristina * 12;
        int oldMasha = Masha * 12;
        int oldDenis = Denis * 12;
        int oldKristina = Kristina * 12;
        int differenceMasha = yearMasha - oldMasha;
        int differenceDenis = yearDenis - oldDenis;
        int differenceKristina = yearKristina - oldKristina;
        System.out.println(" Маша теперь получает " + upMasha + " рублей. Годовой доход вырос на " + differenceMasha + " рублей ");
        System.out.println(" Денис теперь получает " + upDenis + " рублей. Годовой доход вырос на " + differenceDenis + " рублей ");
        System.out.println(" Кристина теперь получает " + upKristina + " рублей. Годовой доход вырос на " + differenceKristina + " рублей ");
    }
}

