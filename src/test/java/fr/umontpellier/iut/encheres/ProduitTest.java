package fr.umontpellier.iut.encheres;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProduitTest {

    private Produit produit;
    private Compte compte;
    private OffreEnchere o;

    @BeforeEach
    public void initialisation() {
        produit = new Produit(0, "", 0, 152);
        compte = new Compte("toto", 59);
        o = new OffreEnchere(15, 20, produit, compte);
        produit.setPasEnchere(2);
        produit.demarrerEnchere();
    }


    @Test
    void test_demmarrer_enchere() {
        assertTrue(produit.estDisponible());
    }


    @Test
    void test_arreter_enchere() {


        produit.ajouterOffre(o);


        produit.arreterEnchere();
        assertFalse(produit.estDisponible());
    }


    @Test
    void test_verifier_offre_enchere_non_demarree() {
        Produit p = new Produit(0, "", 0, 152);
        assertFalse(p.verifierOffre(o));
    }

    @Test
    void test_verifier_offre_quand_pas_d_offre_et_pas_enchere_non_respecte() {
        assertTrue(produit.verifierOffre(o));
    }


    @Test
    void test_verifier_offre_quand_il_y_a_offre_et_pas_enchere_non_respecte() {
        produit.ajouterOffre(o);
        assertTrue(produit.verifierOffre(new OffreEnchere(16, 900, produit, compte)));
    }


    @Test
    void ajouterOffre_quand_pas_d_offre() {
        produit.ajouterOffre(o);
        assertSame(produit.getOffreGagnante(), o);
    }


    @Test
    public void ajouterOffre_quand_il_y_a_offre_pas_enchere_non_respecte() {
        produit.ajouterOffre(o);
        OffreEnchere o2 = new OffreEnchere(16, 20, produit, compte);
        produit.ajouterOffre(o2);
        assertSame(o, produit.getOffreGagnante());
    }

    @Test
    public void ajouterOffre_deux_fois_avec_dernier_gagnat() {
        produit.ajouterOffre(o);
        OffreEnchere o2 = new OffreEnchere(16, 20, produit, compte);
        produit.ajouterOffre(o2);
        OffreEnchere o3 = new OffreEnchere(17, 20, produit, compte);
        produit.ajouterOffre(o2);
        assertSame(o, produit.getOffreGagnante());
    }

    @Test
    public void deux_offre_mais_duexieme_gagnant() {
        produit.ajouterOffre(o);
        OffreEnchere o2 = new OffreEnchere(18, 21, produit, compte);
        produit.ajouterOffre(o2);
        assertSame(o2, produit.getOffreGagnante());
    }

    @Test
    public void test_arreter_enchere_le_produit_n_est_plus_disponible() {
        produit.ajouterOffre(o);
        OffreEnchere o2 = new OffreEnchere(18, 21, produit, compte);
        produit.ajouterOffre(o2);
        OffreEnchere o3 = new OffreEnchere(18, 20, produit, compte);
        produit.ajouterOffre(o3);

        assertSame(o2, produit.getOffreGagnante());
    }



    @Test
    public void trois_offre_mais_duexieme_gagnant() {
        produit.ajouterOffre(o);
        OffreEnchere o2 = new OffreEnchere(18, 21, produit, compte);
        produit.ajouterOffre(o2);
        OffreEnchere o3 = new OffreEnchere(18, 20, produit, compte);
        produit.ajouterOffre(o3);

        assertSame(o2, produit.getOffreGagnante());
    }


}