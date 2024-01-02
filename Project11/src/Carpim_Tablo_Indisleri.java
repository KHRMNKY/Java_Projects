public class Carpim_Tablo_Indisleri {
    public static void main(String[] args) {
        System.out.println("        ÇARPIM TABLOSU");
        System.out.print("  ");

        for (int m = 1; m < 10; m++) {
            System.out.printf("%5d", m);
        }

        System.out.println("\n------------------------------------------------");

        for (int i = 1; i < 10; i++) {
            System.out.print(i + "|");
            for (int j = 1; j < 10; j++) {
                System.out.printf("%5d", (i * 10) + j);
            }
            System.out.println();
        }
    }
}
