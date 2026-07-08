public class armNO {

    public static void main(String... args) {

        // Ispisuje sve Armstrongove brojeve manje od 10000.
        // Armstrongov broj = broj jednak sumi svojih znamenaka
        // potenciranih na broj znamenaka tog broja
        // (npr. 153 = 1^3 + 5^3 + 3^3, jer 153 ima 3 znamenke).

        for (int i = 1; i < 10000; i++) {

            int broj = i;
            int brojZnamenki = String.valueOf(i).length();
            int suma = 0;

            while (broj > 0) {
                int znamenka = broj % 10;
                suma += (int) Math.pow(znamenka, brojZnamenki);
                broj /= 10;
            }

            if (suma == i) {
                System.out.println(i);
            }
        }
    }
}