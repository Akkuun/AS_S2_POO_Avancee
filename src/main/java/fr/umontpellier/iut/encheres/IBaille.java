package fr.umontpellier.iut.encheres;

import java.util.Scanner;

public class IBaille {

    public static void main(String[] args) {


        Scanner saisie = new Scanner(System.in);

        System.out.println("entrer pseudo");
        String p = saisie.next();
        System.out.println("entrer solde");
        int solde1 = saisie.nextInt();
        Compte c1 = new Compte(p, solde1);


        System.out.println("entrer pseudo");
        String p2 = saisie.next();
        System.out.println("entrer solde");
        int solde2 = saisie.nextInt();
        Compte c2 = new Compte(p2, solde2);


        System.out.println("entrer pseudo");
        String p3 = saisie.next();
        System.out.println("entrer solde");
        int solde3 = saisie.nextInt();
        Compte c3 = new Compte(p3, solde3);


        Produit produit = new Produit(0, "", 100, 5);
        OffreEnchere offre = new OffreEnchere(8, 26, produit, c1);

        OffreEnchere offre2 = new OffreEnchere(12, 38, produit, c2);

        OffreEnchere offre3 = new OffreEnchere(8, 13, produit, c3);

        produit.ajouterOffre(offre);
        produit.ajouterOffre(offre2);
        produit.ajouterOffre(offre3);
        System.out.println(produit.getOffreGagnante());
    }
}
