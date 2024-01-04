import java.util.Scanner;
import java.util.Arrays;

public class SortNumbers {
    public static void main(String[] args){
        System.out.println("Kaç eleman gireceksiniz: ");
        Scanner girdi = new Scanner(System.in);
        int elemanSayisi = girdi.nextInt();
        int[] dizi = new int[elemanSayisi];


        for (int i = 0; i < elemanSayisi;i++){
            System.out.println("Lütfen sayilari giriniz: ");
            int eleman = girdi.nextInt();
            dizi[i] = eleman;
        }
        Arrays.sort(dizi);

        System.out.println("Dizi elemanları:");
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.println("Eleman " + (i+1) + ": " + dizi[i]);
        }
        System.out.println(Arrays.toString(dizi));

        /* Dizinin boyutu n : 5
        Dizinin elemanlarını giriniz :
        1. Elemanı : 99
        2. Elemanı : -2
        3. Elemanı : -2121
        4. Elemanı : 1
        5. Elemanı : 0
        Sıralama : -2121 -2 0 1 99
        */
    }
}
