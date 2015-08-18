package dynamicprogramming;

/**
 * Created by tylerfolkman on 8/18/15.
 */
public class Dice {

    private final int m; // number of faces
    private final int n; // number of Dice
    private final int x; // number of interest
    private int[][] memo;

    public Dice(int m, int n, int x){
        this.m = m;
        this.n = n;
        this.x = x;
        memo = new int[n + 1][x + 1];
    }

    public int numberofWays(){

        // initialize
        for (int i = 1; i <= x && i <= m; i++){
            memo[1][i] = 1;
        }

        for (int currentN = 2; currentN <= n; currentN++){
            for (int currentX = 1; currentX <= x; currentX++){
                for (int lookBack = 1; lookBack < currentX && lookBack <= m; lookBack++){
                    memo[currentN][currentX] += memo[currentN-1][currentX - lookBack]; // have to start from higher numbers when x > m
                }
            }
        }

        return memo[n][x];

    }

    public static void main(String[] args){

        Dice dice = new Dice(4, 2, 1); // 0
        System.out.println(dice.numberofWays());
        Dice dice2 = new Dice(2, 2, 3); // 2
        System.out.println(dice2.numberofWays());
        Dice dice3 = new Dice(6, 3, 8); // 21
        System.out.println(dice3.numberofWays());
        Dice dice4 = new Dice(4, 2, 5); // 4
        System.out.println(dice4.numberofWays());
        Dice dice5 = new Dice(4, 3, 5); // 6
        System.out.println(dice5.numberofWays());

    }
}
