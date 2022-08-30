import java.util.Scanner;
public class main {

    public static void main(String args[]){

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter number of dice: ");


        int numdice = obj.nextInt();

        System.out.println("Enter rolls per dice: ");

        int totalrolls = obj.nextInt();

        System.out.println("Enter total sides: ");

        int totalsides = obj.nextInt();

        roller test = new roller(numdice, totalrolls, totalsides);

        test.running();
        System.out.println(test.printer());

    }

}

