public class App2devam {

    public static void main(String[] args) {

        // Kartların değerlerini ve gruplarını tanımla
        int[] deste = new int[52];
        String[] gruplar = {"Maça", "Kupa", "Karo", "Sinek"};
        String[] siralar = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Joker", "Kız", "Papaz"};

        // Kartları başlangıç değerlerine ayarla
        for (int i = 0; i < deste.length; i++) {
            deste[i] = i ;
        }

        // Kartları karıştır
        for (int i = 0; i < deste.length; i++) {
            // Rastgele bir indeks oluştur
            int index = (int) (Math.random() * deste.length);
            // İki kartı yer değiştir
            int temp = deste[i];
            deste[i] = deste[index];
            deste[index] = temp;
        }

        // İlk dört kartı göster
        for (int i = 0; i < 4; i++) {
            // Kartın grubunu ve sırasını belirle
            String grup = gruplar[deste[i] / 13];
            String sira = siralar[deste[i] % 13];
            // Kartı göster
            System.out.println("Kart numarasi: " + deste[i] + ": " + sira + " " + grup);
        }
    }
}
