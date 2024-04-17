//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Litfen a değerini giriniz : ");
        System.out.println("Lütfen b değerini giriniz : ");
        int a = scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println("girilen toplam  değeri :" + (a+b));
        System.out.println("girilen çıkarılan değeri :" + (a-b));
        System.out.println("girilen bölme değeri :" + (a/b));
        System.out.println("girilen çarpma  değeri :" + (a*b));
        System.out.println("girilen mod  değeri :" + (a%b));

        //Kullanıcıdan bilgi alarak üçgen alanı Hesaplama
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Üçgenin  yüksekliğini giriniz :");
        System.out.println("Üçgenin taban uzunluğunu giriniz");
        int h=scanner1.nextInt();
        int base=scanner1.nextInt();
        System.out.println("Üçgenin alanı : " + (h*base)/2) ;

        //Kullanıcıdan girilen sayıyı kontrol etme
        Scanner scanner2 =new Scanner(System.in);
        System.out.println( "Lütfen bir sayı değeri giriniz:");
        int kullanıcısayi=scanner2.nextInt();
        if(kullanıcısayi>0){
            System.out.println("Girilen değer pozitiftir");
        } else if (kullanıcısayi<0) {
            System.out.println("Girilen değer negatiftir");
        }else {
            System.out.println("Girilen sayı sıfırdır");
        }
        //Kullanıcıdan şifre ve doğrulama isteme

        String dogruKullaniciAdi = "kullanici";
        String dogruSifre = "sifre";


        Scanner kullanıcı = new Scanner(System.in);
        System.out.print("Kullanıcı Adı: ");
        String kullaniciAdi = kullanıcı.nextLine();
        System.out.print("Şifre: ");
        String sifre = kullanıcı.nextLine();

        if (kullaniciAdi.equals(dogruKullaniciAdi) && sifre.equals(dogruSifre)) {
            System.out.println("Giriş Başarılı");
        } else {
            System.out.println("Hatalı Giriş");
        }

    }
    }

