package org.example;

public class Main {
    public static void main(String[] args) {

        Ex2 test = new Ex2();
        Paire Petit = new Paire(80, 100.0);
        Paire Grand = new Paire(210, 90.0);
        Paire Incorrect = new Paire(200, 200.0);
        Paire Lourd = new Paire(180, 300.0);

        System.out.println("Taille: 110 cm, poids: 80.0 kg-> ok its " + test.accesOk.test(Petit));
        System.out.println("Taille: 120 cm, poids: 90.0 kg-> ok its " + test.accesOk.test(Grand));
        System.out.println("Taille: 140 cm, poids: 110.0 kg-> ok its " + test.accesOk.test(Incorrect));
        System.out.println("Taille: 190 cm, poids: 190.0 kg-> ok its " + test.accesOk.test(Lourd));
    }

}
