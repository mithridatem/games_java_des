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
            if (this.valeurGobelet > 10) {
                throw new DesException("Le joueur à un score maximal");
            }
             if (this.valeurGobelet < 5)
             {
                 throw new DesException("Le joueur à un score minimal");
             }
            des.setScore(0);
        }
    }
}
