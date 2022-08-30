import java.util.Scanner;
public class roller {

    private int sides;
    private int rls;
    private int dice;
    private int[][] chart;
    private Scanner obj = new Scanner(System.in);
    private int each;

    public roller(int dice, int rls, int sides) {
        this.rls = rls;
        this.sides = sides;
        this.dice = dice;
        chart = new int[sides][dice];
    }


    public void running() {



        for (int c = 0; c < dice; c++) {
            for (int i = 1; i <= rls; i++) {
                System.out.println("Enter number rolled: ");
                each = obj.nextInt();
                while (each < 1 || each > sides) {
                    each = badnum();
                }
                chart[each - 1][c]++;
            }
            if(c!=dice-1) System.out.println("---------\n NEXT DICE \n---------\n");
        }
    }

    public int badnum(){
        System.out.println("This is an invalid number. The number entered must be on the dice," +
                " which should be within 1 to " + sides+ ". Please try again: ");
        return obj.nextInt();
    }

    public String printer() {

        String whole = "-------------\n";

        for (int r = 0; r < dice; r++) {
            whole+=("|  dice "+ (r+1) + "   |\n");
            for (int i = 0; i < chart.length; i++) {
                whole += "| side " + (i + 1) + ": " + chart[i][r] + " |\n";
            }
            whole+= "-------------\n";
        }
        return whole;
    }









}

