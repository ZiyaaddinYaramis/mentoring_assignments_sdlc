package javaKodSorulari05;

public class JavaKodSorulari0502 {

	
	/*
     * a)1-20 arasindaki -20 dahil olmak üzere- çift sayıları yazdırın. e.g.2 4 6 ..
     * 20
     * 
     * 
     * b)1-20 arasindaki -20 dahil olmak üzere- tek sayıları yazdırın. e.g
     * 1,3,5,7,...,19 Virgul dahil!
     * 
     * 
     * d)20 ile 1 arasindaki 5 e bolunebilen sayillari 20 den geriye gelerek
     * yazdirin. e.g.20,15,10,5
     * 
     * 1 - 20 arasındaki tüm çift sayıların toplamını bulun.
     * 
     * 11 veya 15 hariç 1-20 arasındaki tüm sayıları yazdırın; break or continue
     * kullanin.
     */
    public static void main(String[] args) {
        // a
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        // b
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ",");
            }
        }
        System.out.println(" ");
        // c
        for (int i = 20; i > 0; i--) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        
        //d
        int toplam = 0;
        for (int i = 1; i <= 20; i++) {
            if(i %2==0) {
                toplam += i;
            }
        }
        System.out.println(toplam);
        
        
        //e
        for (int i = 1; i <= 20; i++) {
            if(i == 11 || i ==15) {
                continue;
            }
            System.out.print(i + " ");
            
        }
    }

	
	
	
	
	
	
	
	
}
