public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Java ist cool!");

        int a = 3;
        int b = 6;
        int sum = a + b;
        System.out.println("Summe: " + sum);

        int dif = b - a;
        System.out.println("Differenz: " + dif);
        int prod = a * b;
        System.out.println("Produkt: " + prod);
        int quo = b / a;
        System.out.println("Quotient: " + quo);

        boolean bigger = sum >= dif;
        System.out.println("Summe ist größer als Differenz: " + bigger);
        boolean smaller = quo <= prod;
        System.out.println("Quotient ist kleiner als Produkt: " + smaller);
        boolean same = dif == a;
        System.out.println("Differenz ist gleich groß mit a: " + same);

        double doubleNumber = 2.5;
        float floatNumber = 3.2F;

        boolean secondBigger = doubleNumber >= floatNumber;
        System.out.println("Double ist größer als Float: " + secondBigger);
        boolean secondSmaller = doubleNumber <= floatNumber;
        System.out.println("Double ist kleiner als Float: " + secondSmaller);
        boolean secondSame = doubleNumber == floatNumber;
        System.out.println("Double ist gleich Float: " + secondSame);



    }


}
