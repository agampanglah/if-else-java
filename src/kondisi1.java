import java.util.Scanner;

import java.util.Scanner;

public class kondisi1 {

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in); // scanner input untuk memasukan object
//        System.out.println("berapa ipk kamu");
//        double gpa = input.nextDouble();
//
//
//        if ( gpa > 3.0) {
//            System.out.println("lulusan terbaik");
//        } else  if (gpa > 2.5) {
//            System.out.println("kamu lulus maksa");
//        } else {
//            System.out.println("iya udah lulus aja");
//        }
//    }

    public  static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pemain pertama pilih suit batu gunting kertas");
        String PlayerPertama = input.next();
        System.out.println("pemain kedua pilih suit batu guntung kertas");
        String PlayerKedua = input.next();

        if (PlayerPertama.equals("batu")) { //batu
            if (PlayerKedua.equals("gunting")) {
                System.out.println("pemain pertama menang"); //sukses
            } else if (PlayerKedua.equals("kertas")) {
                System.out.println("pemain kedua menang"); //sukses
            } else {
                System.out.println("kedua pemain seri"); //sukses
            }
        }

        if (PlayerPertama.equals("kertas")) { //kertas
            if (PlayerKedua.equals("gunting")) {
                System.out.println("pemain pertama kalah "); //sukses
            } else if (PlayerKedua.equals("batu")) {
                System.out.println("pemain pertama menang"); //sukses
            } else {
                System.out.println("seri"); //sukses
            }
        }

        if (PlayerPertama.equals("gunting")) { //gunting
            if (PlayerKedua.equals("kertas")) {
                System.out.println("pemain pertama menang ");//sukses
            } else if (PlayerKedua.equals("batu")) {
                System.out.println("pemain pertama kalah"); //sukses
            } else {
                System.out.println("seri"); //sukses
            }
        }
    }
}