package com.adrar.jeudes;

public class Gobelet {
    //Attribut
    private Des[] poulDes;
    private int valeurGobelet = 0;

    //Constructeur
    public Gobelet() {}
    public Gobelet(Des[] poulDess)
    {
        this.poulDes = poulDess;
    }

    //getters et setters
    public int getValeurGobelet()
    {
        return this.valeurGobelet;
    }
    public void lancerGobelet()
    {
        for(Des des : this.poulDes){
            des.lancer();
            valeurGobelet += des.getScore();
            des.setScore(0);
        }
    }
}
