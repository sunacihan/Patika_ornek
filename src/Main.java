import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
/*
        //if bloğu kullanmadan sayının 60 dan büyük küçük olma durumu
        Scanner input= new Scanner(System.in);
        int ort=input.nextInt();
        String sonuc=(ort>=60)?"Sınıfı geçti":"Sınıfta kaldı";
        System.out.println(sonuc);  */

        //Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
        // tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
/*
        Scanner input= new Scanner(System.in);
        double g_sayi=input.nextDouble();
        double kdvli_fiyat;
        if (0<g_sayi && g_sayi<=1000){
            kdvli_fiyat=g_sayi*0.18;
            System.out.println(kdvli_fiyat);
        } else if (g_sayi>1000) {
            kdvli_fiyat=g_sayi*0.08;
            System.out.println(kdvli_fiyat);
        }
        else {
            System.out.println("Hata! Sıfırdan küçük sayı girdiniz.");
        }   */

        //Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
        Scanner input= new Scanner(System.in);
        System.out.print("Üçgenin 1. kenarını giriniz.");
        int kenar1=input.nextInt();
        System.out.print("Üçgenin 1. kenarını giriniz.");
        int kenar2=input.nextInt();
        System.out.print("Üçgenin 1. kenarını giriniz.");
        int kenar3=input.nextInt();


    }
}