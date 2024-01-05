    //Java dilinde, dizideki elemanların kaç kez tekrar edildiğini
    // yani frekanslarını bulan programı yazınız.
    import java.util.Arrays;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
           Scanner giris = new Scanner(System.in);

            System.out.println("Kaç adet sayı gireceksiniz: ");
            int adetSayi = giris.nextInt();
            int[] dizi = new int[adetSayi];
            int[] frekanslar = new int[adetSayi];

            for (int i = 0; i < adetSayi; i++){
                System.out.println("Lütfen sayi giriniz: ");
                int a = giris.nextInt();
                dizi[i] = a;
            }
            Arrays.sort(dizi);
            System.out.println(Arrays.toString(dizi));
            freqCount(dizi);
        }

        private static void freqCount(int[] dizi) {
            for (int i = 0; i < dizi.length; i++){
                int frekans = 1; // Her elemanın tekrar sayısını 1
                // olarak başlatıyoruz

                // Eğer aynı eleman bir sonraki elemanla aynı ise
                // frekansı artır
                while (i < dizi.length - 1 && dizi[i] == dizi[i + 1]) {
                    frekans++;
                    i++;
                }
                System.out.println(dizi[i] + " sayısı " + frekans + " kez tekrar edildi.");

            }
            System.out.println("Dizi: " + Arrays.toString(dizi));
        }
    }