package fr.umontpellier.iut;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GestionEmployesTest {

    private Commercial e1;

    private Technicien e2;

    private Fabricant e3;

    private Employe e4;

    private Fabricant question5;
    private Vendeur test;
    private Representant test_reprensantant;

    @BeforeEach
    public void init() {
        e1 = new Vendeur.VendeurBuilder().setNrINSEE("AAA").setNom("JUJU").setEchelon(2).setBase(9.38).setNbHeures(36).setChiffreAffaires(3).setTauxCommission(6).createVendeur();
        e2 = new Technicien.TechnicienBuilder().setNrINSEE("BBB").setNom("daj").setEchelon(3).setBase(3).setNbHeures(40).createTechnicien();
        e3 = new Fabricant.FabricantBuilder().setNrINSEE("CCC").setNom("bap").setEchelon(3).setBase(3).setNbHeures(49).setNbUnitesProduites(13).setTauxCommissionUnite(30.6).createFabricant();
        question5 = new Fabricant.FabricantBuilder().setNrINSEE("CCC").setNom("bap").setEchelon(3).setBase(3).setNbHeures(49).setNbUnitesProduites(13).setTauxCommissionUnite(30.6).createFabricant();
        test_reprensantant = new Representant.RepresentantBuilder().setEchelon(2).setBase(4).setNbHeures(3).createRepresentant();
    }


    @Test
    public void test_return_SalaireBrut_commercial() {

        assertEquals(27.38, e1.getSalaireBrut(), 0.1);
    }

    @Test
    public void test_return_SalaireNet_commercial() {

        assertEquals(21.904, e1.getSalaireNet(), 0.1);
    }

    @Test
    public void test_negocier_transaction() {
        e1.negocierTransaction(32.3);
        e1.negocierTransaction(56.8);
        assertEquals(92.1, e1.getChiffreAffaires());
    }

    @Test
    public void test_return_SalaireBrut_fabriquant() {

        assertEquals(544.8, e3.getSalaireBrut());
    }

    @Test
    public void test_return_SalaireNet_fabriquant() {

        assertEquals(435.84, e3.getSalaireNet());
    }

    @Test
    public void test_return_SalaireBrut_Technicien() {

        assertEquals(420, e2.getSalaireBrut());
    }

    @Test
    public void test_return_SalaireNet_Technicien() {

        assertEquals(336, e2.getSalaireNet());
    }

    @Test
    public void test_return_SalaireBrut_Vendeur() {

        assertEquals(27.38, e1.getSalaireBrut(), 0.1);
    }

    @Test
    public void test_return_SalaireBrut_Representant() {

        test_reprensantant.representerEntreprise(); //nombre reprensation =2 | echelon=2 | base = 2 |nbHeure=3
        assertEquals(335, test_reprensantant.getSalaireBrut(), 0.1);
    }


}