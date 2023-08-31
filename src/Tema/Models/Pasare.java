package Tema.Models;

public class Pasare {
        private String specie;
        private int varsta;
        private int marimeAripi;
        private String culoareOchi;
        private boolean zburatoare;



        public Pasare() {
        }

        public Pasare(String specie, int varsta, int marimeAripi, String culoareOchi, boolean zburatoare) {
            this.specie = specie;
            this.varsta = varsta;
            this.marimeAripi = marimeAripi;
            this.culoareOchi = culoareOchi;
            this.zburatoare = zburatoare;
        }

        public Pasare(String specie, int varsta) {
            this.specie = specie;
            this.varsta = varsta;
        }



        public void setSpecie(String specie) {
            this.specie = specie;
        }

        public void setVarsta(int varsta) {
            this.varsta = varsta;
        }

        public void setMarimeAripi(int marimeAripi) {
            this.marimeAripi = marimeAripi;
        }

        public void setCuloareOchi(String culoareOchi) {
            this.culoareOchi = culoareOchi;
        }

        public void setZburatoare(Boolean zburatoare) {
            this.zburatoare = zburatoare;
        }




        public String getSpecie() {
            return this.specie;
        }

        public int getVarsta() {
            return this.varsta;
        }

        public int getMarimeAripi() {
            return this.marimeAripi;
        }

        public String getCuloareOchi() {
            return this.culoareOchi;
        }

        public Boolean getZburatoare() {
            return this.zburatoare;
        }

        public String descriere() {

            String text = "";
            text += "Specie: " + this.specie + "\n";
            text += "Varsta: " + this.varsta + "\n";
            text += "Marime aripi: " + this.marimeAripi + "\n";
            text += "Culoare ochi: " + this.culoareOchi + "\n";
            text += "Este zburatoare: " + this.zburatoare + "\n";

            System.out.println(text);
            return descriere();
        }
    }
