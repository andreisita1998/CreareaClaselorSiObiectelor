public class Chocolate extends Product{
    int greutate;
    public Chocolate(String numeprodus, String codbare, double pretbaza, double taxa, int greutate) {
        super(numeprodus, codbare, pretbaza, taxa, greutate);
        this.greutate = greutate;
    }
        String getInfoChocolate() {
            return "Nume Produs: " + this.getNumeprodus() + "\n" +
                    "Cod Bare: " + this.getCodbare() + "\n" +
                    "Pret Baza: " + this.getPretbaza() + "\n" +
                    "Taxa: " + this.getTaxa() + "\n" +
                    "Greutatea ciocolatii: " + this.greutate;
        }



}

