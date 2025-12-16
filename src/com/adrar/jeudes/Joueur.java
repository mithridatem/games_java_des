package com.adrar.jeudes;

public class Joueur {

    private String nom;
    private Gobelet gobelet;
    private int valeurLance;

    public Joueur(String nom, Gobelet gobelet)
    {
        this.nom = nom;
        this.gobelet = gobelet;
    }

    public String getNom() {
        return nom;
    }

    public int getValeurLance() {
        return this.valeurLance;
    }

    public void lancerGobelet()
    {
        this.gobelet.lancerGobelet();
        this.valeurLance = this.gobelet.getValeurGobelet();
    }
}
