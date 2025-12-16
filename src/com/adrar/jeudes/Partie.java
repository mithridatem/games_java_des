package com.adrar.jeudes;

public class Partie {

    private Joueur j1;
    private Joueur j2;
    private int nbrTour = 5;
    private int scoreJ1;
    private int scoreJ2;

    public Partie(Joueur j1, Joueur j2, int nbrTour)
    {
        this.j1 = j1;
        this.j2 = j2;
        this.nbrTour = nbrTour;
        this.scoreJ1 = 0;
        this.scoreJ2 = 0;
    }

    public Joueur getJ1() {
        return j1;
    }

    public void setJ1(Joueur j1) {
        this.j1 = j1;
    }

    public Joueur getJ2() {
        return j2;
    }

    public void setJ2(Joueur j2) {
        this.j2 = j2;
    }

    public int getNbrTour() {
        return nbrTour;
    }

    public void lancerPartie()
    {
        //Itération du nombre de tour
        for (int i = 0; i < this.nbrTour; i++) {
            this.tourPartie();
        }

        //condition de victoire
        this.victoirePartie();

        //Reset de la partie
        this.resetPartie();

    }

    private void tourPartie()
    {
        //Lancer de chaque joueur
        this.j1.lancerGobelet();
        this.j2.lancerGobelet();

        //test si j1 gagne
        if (this.j1.getValeurLance() > this.j2.getValeurLance()) {
            this.scoreJ1 += 2;
        }
        //test si j2 gagne
        if (this.j1.getValeurLance() < this.j2.getValeurLance()) {
            this.scoreJ2 += 2;
        }
        //test si égalité
        if (this.j1.getValeurLance() == this.j2.getValeurLance()) {
            this.scoreJ1++;
            this.scoreJ2++;
        }
    }

    private void victoirePartie()
    {
        if (this.scoreJ1 > this.scoreJ2) {
            System.out.println("Le gagnant est " + this.j1.getNom() + " avec un score de : "
                    + this.scoreJ1 + " versus : " + this.scoreJ2);
        }
        if (this.scoreJ2 > this.scoreJ1) {
            System.out.println("Le gagnant est " + this.j2.getNom() + " avec un score de : "
                    + this.scoreJ2 + " versus : " + this.scoreJ1);
        }
        if (this.scoreJ1 == this.scoreJ2) {
            System.out.println("Egalité avec : " + this.scoreJ1);
        }
    }

    private void resetPartie()
    {
        this.scoreJ1 = 0;
        this.scoreJ2 = 0;
    }
}
