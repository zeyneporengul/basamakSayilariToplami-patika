package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int deger, kalan=1, toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        deger = input.nextInt();

        while(deger !=0 && kalan!= 0){
            kalan = deger%10;
            deger = deger/10;
            toplam += kalan;
        }
        System.out.println("Girdiğiniz sayının basamak değerleri toplamı: " + toplam);
    }
}
