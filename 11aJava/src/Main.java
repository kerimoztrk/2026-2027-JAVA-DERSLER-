import java.util.Scanner;

void main() {


    // ------------- Yazdırma Komutları------ -

//    System.out.println("Kerim");
//    System.out.println("Ahmet");
//    System.out.println("Mehmet");
//
//
//    System.out.println("----------Yemek  Çeşitleri----------");
//    System.out.println();
//    System.out.println("1- Ana Yemek");
//    System.out.println("2- Çorba");
//    System.out.println("3- İçecekler");
//    System.out.println("4- Salata");
//    System.out.println("5- Tatlılar");
//    System.out.println();
//    System.out.println("----------Yemek  Çeşitleri----------");




    // DEĞİŞKEN İSİMLENDİRME KURAAALLARI

    // SNAKE CASE => degisken_turu_ornegi

    //CAMEL CASE => degiskenTuruOrnegi

    //PASCAL CASE => DegiskenTuruOrnegi

    //Kebab CASE => degisken-turu-ornegi

    //Hungarian CASE => strDegiskenTuruOrnegi



    // String değişkenler
//
//    String musteriAdi =" Melih";
//    String musteriSoyadi="Acar";
//    String musteriEmail="asdasdasdas@hotmail.com";
//    String musteriTelefonNo="0555555555555";
//    String ilce="Gaziosmanpaşa";
//    String Sehir="istanbul";
//
//
//    System.out.println("-------------Rezervasyon kartı------------");
//    System.out.println();
//    System.out.println("Müşteri Adı : "+musteriAdi);
//    System.out.println("Müşteri Soy Adı : "+musteriSoyadi);
//    System.out.println("Müşteri Epostası :" + musteriEmail);
//    System.out.println("Müşteri Telefon numarası: "+musteriTelefonNo);
//    System.out.println("Adres :"+Sehir +" / "+ilce);
//    System.out.println();
//    System.out.println("-------------Rezervasyon kartı------------");


//
//    //int değişkenler
//
//    int hamburgerFiyati= 300;
//    int kolaFiyatı=56;
//    int suFiyatı=233;
//    int kızartmaFiyatı=222;
//    int limonataFiyatı=12;
//
//    int hamburgerSayisi=2;
//    int kolaSayisi=2;
//    int suSayisi=2;
//    int kizartmaSayisi=2;
//    int limonataSayisi=2;
//
//    int toplamHamburgerFiyati= hamburgerFiyati*hamburgerSayisi;
//    int toplamKolaFiyati= kolaFiyatı*kolaSayisi;
//    int toplamSuFiyati= suFiyatı*suSayisi;
//    int toplamKizartmaFiyati= kizartmaSayisi-kızartmaFiyatı;
//    int toplamLimonataFiyati= limonataFiyatı*limonataSayisi;
//
//    int ButunToplam= toplamHamburgerFiyati+toplamKolaFiyati+toplamSuFiyati+toplamKizartmaFiyati+toplamLimonataFiyati;

//


 // DOUBLE DEĞİŞKENLER
    double elmaFiyati=12.5;
    double portakalFiyati=12.5;
    double elma2Fiyati=12.5;

    //Char değişkenler
    char sembol='k';



    //Klavyeden veri giriişleri

//
   Scanner input = new Scanner(System.in);
//
//
//    System.out.println("************* 11-A hava yolları yolcu bilgisi ***********");
//
//    System.out.println("Yolcu Adı: ");
//    String yolcuAdi=input.nextLine();
//
//
//    System.out.println("Yolcu SoyAdı: ");
//    String yolcuSoyadi=input.nextLine();
//
//    System.out.println("İlçe: ");
//    String ilce=input.nextLine();
//
//    System.out.println("Şehir: ");
//    String sehir=input.nextLine();
//
//    System.out.println("Yaş: ");
//    String yas=input.nextLine();
//
//    System.out.println("Yolcu Tc kimlik: ");
//    String kimlik=input.nextLine();
//
//
//    System.out.println("\n --------- Yolcu Kartı  ----------");
//    System.out.println("TC: "+kimlik);
//    System.out.println("Ad Soyad: "+ yolcuAdi+ " "+ yolcuSoyadi);
//    System.out.println("İlçe/Sehir: "+ilce+"/"+sehir);
//    System.out.println("Yaş : "+ yas);
//    System.out.println("\n --------- Yolcu Kartı  ----------");
//

//Klavyeden tam sayı girişi

//    int ayakkabiFiyati=1000,bilgisayarFiyati=20000,tvFiyati=10000,koltukFiyati=5000;
//
//    System.out.println("Aldıgınız ayakkabı sayısı: ");
//    int ayakkabiSayisi=Integer.parseInt(input.nextLine());
//
//    System.out.println("Aldıgınız bilgisayar sayısı: ");
//    int bilgisayarSayisi=Integer.parseInt(input.nextLine());
//
//    System.out.println("Aldıgınız tv sayısı: ");
//    int tvSayisi=Integer.parseInt(input.nextLine());
//
//    System.out.println("Aldıgınız koltuk sayısı: ");
//    int koltukSayisi=Integer.parseInt(input.nextLine());
//
//
//    int toplamFiyat=(ayakkabiFiyati*ayakkabiSayisi)+(bilgisayarFiyati*bilgisayarSayisi)+(tvFiyati*tvSayisi)+(koltukFiyati*koltukSayisi);
//
//    System.out.println("Toplam ödememmiz gereken fiyat : "+toplamFiyat+" TL");

    //klavyeden ondalıklı sayi girişi

//    System.out.println("1.sınav notu: ");
//    double sinav1= Double.parseDouble(input.nextLine());
//
//    System.out.println("2.sınav notu: ");
//    double sinav2= Double.parseDouble(input.nextLine());
//
//    System.out.println("3.sınav notu: ");
//    double sinav3= Double.parseDouble(input.nextLine());
//
//
//    double toplamNot=(sinav1+sinav2+sinav3)/3;
//
//    System.out.println("Ortalama : "+ toplamNot);
//

    // Klavyeden karakter girşi

    System.out.println("Cinsiyet Seçiniz: (E/K)");

    char cinsiyet= input.nextLine().charAt(0);

    System.out.println("Seçilen Cinsiyet: "+ cinsiyet);

}
