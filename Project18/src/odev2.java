public class odev2 {
public static void main(String[] args) {
    
int[] liste = {1, 2, 3, 4, 5, 6};

for (int i = 1; i < liste.length; i++)
    liste[i] = liste[i - 1];

for (int i = 0; i < liste.length; i++)
    System.out.print(liste[i] + " ");
}
}