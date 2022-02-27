package fr.umontpellier.iut;


public class Representant extends Commercial {


    private Technicien delegation;
    private int nombreRepresentation;

    public Representant(String nrINSEE, String nom, int echelon, double base, double nbHeures, double chiffreAffaires, double tauxCommission) {
        super(nrINSEE, nom, echelon, base, nbHeures, chiffreAffaires, tauxCommission);
    }

    public void representerEntreprise() {
        nombreRepresentation++;
    }

    @Override
    public double getSalaireBrut() {
        delegation = new Technicien.TechnicienBuilder() //création de notre objet de délégation afin d'utiliser notre fonction voulu
                .setBase(super.getBase())
                .setNbHeures(super.getNbHeures())
                .setEchelon(super.getEchelon())
                .createTechnicien();


        return delegation.getSalaireBrut() + nombreRepresentation * 123;
    } //     méthode de Technicien qu'on veut récuperer return super.getSalaireBrut()+(getEchelon()*100);


    public static class RepresentantBuilder {
        private String nrINSEE;
        private String nom;
        private int echelon;
        private double base;
        private double nbHeures;
        private double chiffreAffaires;
        private double tauxCommission;

        public RepresentantBuilder setNrINSEE(String nrINSEE) {
            this.nrINSEE = nrINSEE;
            return this;
        }

        public RepresentantBuilder setNom(String nom) {
            this.nom = nom;
            return this;
        }

        public RepresentantBuilder setEchelon(int echelon) {
            this.echelon = echelon;
            return this;
        }

        public RepresentantBuilder setBase(double base) {
            this.base = base;
            return this;
        }

        public RepresentantBuilder setNbHeures(double nbHeures) {
            this.nbHeures = nbHeures;
            return this;
        }

        public RepresentantBuilder setChiffreAffaires(double chiffreAffaires) {
            this.chiffreAffaires = chiffreAffaires;
            return this;
        }

        public RepresentantBuilder setTauxCommission(double tauxCommission) {
            this.tauxCommission = tauxCommission;
            return this;
        }

        public Representant createRepresentant() {
            return new Representant(nrINSEE, nom, echelon, base, nbHeures, chiffreAffaires, tauxCommission);
        }
    }
}
