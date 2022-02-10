package fr.umontpellier.iut.exo3;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GestionEtudiantsTest {

    @Disabled
    @Test
    public void test_if_main_method_does_not_throw_exceptions() {

        assertDoesNotThrow(() -> GestionEtudiants.main(new String[1]));

    }

    @Test
    public void test_contructeur_EtudiantTelecopique_doit_retourner_nom_et_prenom_avec_constructeur_nom_et_prenom(){
        EtudiantsTelescopique e1=new EtudiantsTelescopique("toto","pipou");

        assertEquals(e1,e1);
    }

}