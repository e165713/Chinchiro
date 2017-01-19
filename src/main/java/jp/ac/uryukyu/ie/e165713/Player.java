package jp.ac.uryukyu.ie.e165713;

/**
 * Created by ichikitakahiro on 2017/01/18.
 */
public class Player {
    private int dice1;
    private int dice2;
    private int dice3;

    public void Throw(){
       dice1 = (int)(Math.random()*6)+1;
        System.out.printf("%d",dice1);
    }

    public int getDice1() {
        return dice1;
    }

    public void setDice1(int dice1) {
        this.dice1 = dice1;
    }

}
