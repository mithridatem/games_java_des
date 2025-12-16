package com.adrar.jeudes;

public class Des {

    private int nbrFace = 6;
    private int score;

    public Des(int nbrFace) {
        this.nbrFace = nbrFace;
    }


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void lancer()
    {
        int min = 1;
        int range = this.nbrFace - min + 1;
        this.score = (int)(Math.random() * range) + min;
    }
}
