package com.mertalmc.mantiksalBaglaclar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        ! (Not)
        Kullanımı: !(3 > 4)
        Anlamı:
        true bir değeri false, false değeri true

        && (And)
        Kullanımı (3 > 4) && ("yazılım" == "yazılım")
        Anlamı:
        true, true ---> true
        false, true ---> false
        true, false ---> false
        flase, false ---> false

        || (or)
        Kullanımı : (3 > 4) || ("yazılım" == "yazılım")
        true,true ---> true
        false, true ---> true
        true, false ---> true
        false, false ---> false

        System.out.println("Sonuç: "+ !(3>4)); // not operatoru
        System.out.println("Sonuç: "+ ((3>4) && ("yazılım"=="yazılım")));// and
        System.out.println("Sonuç: "+ ((3>4) ||("yazılım"=="yazılım"))); // or
         */
        /* Exclusive or (veya XOR), Java gibi birçok programlama dilinde kullanılan mantıksal bir operatördür. XOR operatörü, iki ifade arasındaki bağlantıyı değerlendirir ve sadece bir tanesinin true olduğu durumlarda sonuç true olur. Diğer durumlarda sonuç false olur.
       boolean ifade1 = true;
         boolean ifade2 = false;
        XOR operatörü: Sadece bir tanesi true olduğunda sonuç true olur.
         boolean sonuc = ifade1 ^ ifade2;
         System.out.println("Sonuç: " + sonuc); // Sonuç: true
       */
        // user input
        String kullanici_adi = "Mert";
        String parola = "12345";

        // create the scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kullanıcı Adı: ");
        String kul_adi = scanner.nextLine();

        System.out.println("Parola: ");
        String kul_parola = scanner.nextLine();

        // String objelerinin birbiriyle KIYASLANMASI ' .equals '
        // nesnelerin eşitliklerini karşılaştırmak

        // !() kullanici_adi ve kul_adi değerleri eşit değilse
        if (!(kullanici_adi.equals(kul_adi)) && !(parola.equals(kul_parola))) {
            System.out.println("Giriş başarısız.");

        } else if ((kullanici_adi.equals(kul_adi)) && !(parola.equals(kul_parola))) { // kullanici_adi dogru, parola yanlış
            System.out.println("Parola yanlış.");

        } else if (!(kullanici_adi.equals(kul_adi)) && (parola.equals(kul_parola))) { // kullanici adi yanlış
            System.out.println("Kullanıcı Adı yanlış.");

        } else { // kullanici ve parola doğru
            System.out.println("Hoşgeldiniz " + kullanici_adi);
        }
    }
}