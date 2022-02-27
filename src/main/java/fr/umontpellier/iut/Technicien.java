package fr.umontpellier.iut;

public class Technicien extends Employe { // héritage de la classe Employe
    public Technicien(String nrINSEE, String nom, int echelon, double base, double nbHeures) {
        super(nrINSEE, nom, echelon, base, nbHeures);
    }



    public void effectuerTacheTechnique(){

        System.out.println("le technicien effectue sa tâche ");
    }


    @Override
    public double getSalaireBrut() {
        return super.getSalaireBrut()+(getEchelon()*100);
    }


    public static class TechnicienBuilder {
        private String nrINSEE;
        private String nom;
        private int echelon;
        private double base;
        private double nbHeures;

        public TechnicienBuilder setNrINSEE(String nrINSEE) {
            this.nrINSEE = nrINSEE;
            return this;
        }

        public TechnicienBuilder setNom(String nom) {
            this.nom = nom;
            return this;
        }

        public TechnicienBuilder setEchelon(int echelon) {
            this.echelon = echelon;
            return this;
        }

        public TechnicienBuilder setBase(double base) {
            this.base = base;
            return this;
        }

        public TechnicienBuilder setNbHeures(double nbHeures) {
            this.nbHeures = nbHeures;
            return this;
        }

        public Technicien createTechnicien() {
            return new Technicien(nrINSEE, nom, echelon, base, nbHeures);
        }
    }
}
