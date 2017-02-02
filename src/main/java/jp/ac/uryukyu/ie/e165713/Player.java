package jp.ac.uryukyu.ie.e165713;

/**
 * Created by ichikitakahiro on 2017/01/18.
 */
public class Player {
    private int dice1;
    private int dice2;
    private int dice3;
    private int dice_point;
    private String kind_dice;
    private int[] dice = {0,0,0};

    public int[] Throw(){
        dice1 = (int)(Math.random()*6)+1;
        dice2 = (int)(Math.random()*6)+1;
        dice3 = (int)(Math.random()*6)+1;
        sort();
        dice[0] = dice1;
        dice[1] = dice2;
        dice[2] = dice3;
        return dice;
    }

    public void sort(){
        int pro = 0;
        if(dice2 > dice3){
            pro = dice3;
            dice3 = dice2;
            dice2 = pro;
        }
        if(dice1 > dice2){
            pro = dice2;
            dice2 = dice1;
            dice1 = pro;
            sort();
        }
    }

    public int point(){
        if(dice1 == dice3){
            if(dice1 == 1) dice_point = 9;
                else dice_point = 8;
        }else if(dice1 == dice2) {
            dice_point = dice3;
        } else if(dice2 == dice3) {
            dice_point = dice1;
        }else if(dice1 == 4 && dice2 == 5 && dice3 == 6 ){
            dice_point = 7;
        }else if(dice1 == 1 && dice2 == 2 && dice3 == 3 ){
            dice_point = -1;
        }else{
            dice_point = 0;
        }
        return dice_point;
    }

    public int getDice1() {
        return dice1;
    }

    public void setDice1(int dice1) {
        this.dice1 = dice1;
    }

    public int getDice2() {
        return dice2;
    }

    public void setDice2(int dice2) {
        this.dice2 = dice2;
    }
    public int getDice3() {
        return dice3;
    }

    public void setDice3(int dice3) {
        this.dice3 = dice3;
    }

}
