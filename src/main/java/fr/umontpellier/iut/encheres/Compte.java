package fr.umontpellier.iut.encheres;

import java.util.ArrayList;

public class Compte {
    private String pseudo;
    private int solde;
    private ArrayList<OffreEnchere> mesEncheres;
    private ArrayList<Produit> produitsAchetés;

    public Compte(String pseudo, int solde) {
        this.pseudo = pseudo;
        this.solde = solde;
        mesEncheres = new ArrayList<>();
        produitsAchetés = new ArrayList<>();
    }

    public int getSolde() {
        return solde;
    }

    public void crediterCompte(int somme) {
        solde = solde + somme;

    }

    public OffreEnchere creerOffre(Produit produit, int prix, int prixMax) {
        OffreEnchere o = new OffreEnchere(prix, prixMax, produit, this);

        if (solde >= prixMax + produit.getCoutParticipation()
                && prixMax >= produit.getPrixEncours()
                && produit.verifierOffre(o))
        {
            mesEncheres.add(o);
            solde=solde-prixMax-produit.getCoutParticipation();
            return new OffreEnchere(prix, prixMax, produit, this);
        } else {
            return null;
        }

    }
}
