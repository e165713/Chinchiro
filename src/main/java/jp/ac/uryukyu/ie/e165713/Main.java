package jp.ac.uryukyu.ie.e165713;

/**
 * Created by ichikitakahiro on 2017/01/18.
 */
public class Main {
    public static void main(String[] args){
        Player player1 = new Player();
        Player player2 = new Player();
        int[] player1_dice = player1.Throw();
        int[] player2_dice = player2.Throw();
        System.out.print("player1の出目は");
        for(int i = 0 ; i<3; i++){
            System.out.printf("%d,",player1_dice[i]);
        }
        System.out.printf("\nplayer2の出目は");
        for(int i = 0 ; i<3; i++){
            System.out.printf("%d,",player2_dice[i]);
        }
    }
}
