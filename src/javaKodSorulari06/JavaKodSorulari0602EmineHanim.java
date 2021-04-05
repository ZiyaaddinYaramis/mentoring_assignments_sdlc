package javaKodSorulari06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaKodSorulari0602EmineHanim {

	public static void main(String[] args) {


		
		Scanner scan = new Scanner ( System.in);
        
        int toplam=0;
        int sayac=0;
        int sayı=scan.nextInt();
        try {
        do {
            System.out.println("tam sayılar giriniz");
            sayı=scan.nextInt();
            toplam+=sayı;
            System.out.println(toplam);
            sayac++;
            
        } while (!(toplam>=100));
        
        System.out.println(sayac + "tane sayı girdin, bu kadar sayı yeter");}
        catch(InputMismatchException e) {
            System.out.println("lütfen ondalıklı değil tamsayılar giriniz");

	}

	}
}