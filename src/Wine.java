public class Wine extends Product{
    int volum;
    public Wine(String numeprodus, String codbare, double pretbaza, double taxa, int volum) {
        super(numeprodus, codbare, pretbaza, taxa, volum);
        this.volum = volum;
    }
        String getInfoWine() {
            return "Nume Produs: " + this.getNumeprodus() + "\n" +
                    "Cod Bare: " + this.getCodbare() + "\n" +
                    "Pret Baza: " + this.getPretbaza() + "\n" +
                    "Taxa: " + this.getTaxa() + "\n" +
                    "Volumul vinului: " + this.volum;
        }
    static double PretFinalVin(double pretbaza) {
        pretbaza = 15.3; double taxa=0.2; double taxaspec=0.1;
        double pretfinal = pretbaza+taxa*pretbaza+taxaspec*pretbaza;
        return pretfinal;
    }
    }

