package fr.umontpellier.iut.encheres;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Produit {
    private final int numero;
    private String description;
    private final int prixInitial;
    static private int pasEnchere;
    private int coutParticipation;
    private ArrayList<OffreEnchere> listeOffre;
    private OffreEnchere offreGagante;

    private boolean disponible;

    public Produit(int numero, String description, int prixInitial, int coutParticipation) {
        this.description = description;
        this.prixInitial = prixInitial;
        this.coutParticipation = coutParticipation;
        this.numero = numero;
        disponible = false;
        listeOffre = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    // question 1
    public static int getPasEnchere() {
        return pasEnchere;
    }

    // question 1
    public static void setPasEnchere(int pas) {
        pasEnchere = pas;
    }

    public void demarrerEnchere() {
        disponible = true;
    }

    public void arreterEnchere() {
        offreGagante.getMonCompte().setSolde(offreGagante.getPrixMax() - getPrixEncours());

        offreGagante.getMonCompte().getProduitsAchetés().add(this);
        disponible = false;


    }

    // question 5
    public int getPrixEncours() { //son prix initial va changer par rapport au prix de l'offre gagante actuelle

        return prixInitial;


    }

    // pré-requis : l'offre passée en paramètre est valide
    public void ajouterOffre(OffreEnchere o) {
        listeOffre.add(o);
        if (listeOffre.size() == 1) {

            o.setEtatGagnant(true);
            offreGagante = o;

        } else if (offreGagante.getPrixMax() >= o.getPrixMax()) {
            offreGagante.setPrixEnCours(o.getPrixMax());

        } else if (offreGagante.getPrixMax() < o.getPrixMax()) {
            int nouveauPrix = o.getPrixEnCours() >= offreGagante.getPrixMax() ? o.getPrixEnCours() : offreGagante.getPrixEnCours();
            offreGagante.setEtatGagnant(false);
            o.setEtatGagnant(true);
            offreGagante = o;
            offreGagante.setPrixEnCours(nouveauPrix);
        }


    }

    public int getCoutParticipation() {
        return coutParticipation;
    }

    public OffreEnchere getOffreGagnante() {
        return offreGagante;
    }

    public boolean estDisponible() {

        if (disponible){
            return true;
        }
        return false;
    }


    // vérifie si l'offre est correcte
    public boolean verifierOffre(OffreEnchere offre) {
        boolean isGood = false;

        if (disponible && offre.getProduit().equals(this)) {


            if (listeOffre.isEmpty()) { //si première offre
                if (offre.getPrixEnCours() >= this.getPrixEncours()) {
                    isGood = true;
                }

            } else if (offre.getPrixEnCours() >= pasEnchere + this.getPrixEncours()) {
                isGood = true;
            }
        }


        return isGood;
    }


    // fonction permettant la comparaison des Produits
    // cette fonction doit rester intacte
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produit produit)) return false;
        return getNumero() == produit.getNumero();
    }

    // fonction auxiliaire définissant le hashCode des objets de type Produit en respectant le contrat de equals(Object o)
    // cette fonction doit rester intacte
    @Override
    public int hashCode() {
        return Objects.hash(getNumero());
    }


}
