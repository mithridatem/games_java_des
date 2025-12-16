package com.adrar.jeudes;

public class Main {
    static void main() {
        Des des1 = new Des(6);
        Des des2 = new Des(6);
        Des des3 = new Des(6);
        Des des4 = new Des(6);
        Des des5 = new Des(6);
        Des des6 = new Des(6);
        Des[] tabDesJ1 = {des1, des2, des3};
        Des[] tabDesJ2 = {des4, des5, des6};
        Des[] tabDesJ3 = {new Des(6),  new Des(6), new Des(6)};
        Gobelet gobeletJ1 = new Gobelet(tabDesJ1);
        Gobelet gobeletJ2 = new Gobelet(tabDesJ2);

        Joueur joueur1 = new Joueur("Mathieu", gobeletJ1);
        Joueur joueur2 = new Joueur("Marie", gobeletJ2);
        Partie partie = new Partie(joueur1, joueur2, 10);
        for (int i = 0; i < 500; i++) {
            partie.lancerPartie();
        }
    }
}
