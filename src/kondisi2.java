import java.util.Scanner;

public class kondisi2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan ipk kamu !!!!");
        double GPA = input.nextDouble();

        if (GPA > 3.0) {
            System.out.println("cie bagus tuh, lulusan terbaik bosku");

        } else if ( GPA > 2.5 ) {
            System.out.println(" ciee luluss maksa, mabok mulu sih");
        } else {
            System.out.println("untung gk D.O BOS !!!!");}
    }

}
