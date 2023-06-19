public class Product {
    private String numeprodus;
    private String codbare;
    private double pretbaza;
    private double taxa;



    public void setNumeprodus(String numeprodus) {
        this.numeprodus=numeprodus;
    }
    public String getNumeprodus() {
        return numeprodus;
    }
    public void setCodbare(String codbare) {
        this.codbare=codbare;
    }
    public String getCodbare()
    {
        return codbare;
    }

    public void setPretbaza(double pretbaza) {
        this.pretbaza = pretbaza;
    }
    public double getPretbaza()
    {
        return pretbaza;
    }

    public void setTaxa(double taxa) {
        this.taxa = 0.2;
    }
    public double getTaxa()
    {
        return taxa;
    }
    public Product(String numeprodus, String codbare, int pretbaza, double taxa)
    {
        this.numeprodus = numeprodus; this.codbare = codbare; this.pretbaza = pretbaza; this.taxa=taxa;
    }

    public Product(String numeprodus, String codbare, double pretbaza, double taxa, int greutate)
    {  this.numeprodus = numeprodus; this.codbare = codbare; this.pretbaza = pretbaza; this.taxa=taxa; }


    String getInfo() {
        return "Nume Produs: " + this.getNumeprodus() + "\n" +
                "Cod Bare: " + this.getCodbare() + "\n" +
                "Pret Baza: " + this.getPretbaza() + "\n" +
                "Taxa: " + this.getTaxa();
    }

    public double PretFinal(double pretbaza) {
        double taxa=0.2;
        double pretfinal = pretbaza + taxa*pretbaza;
        return pretfinal;
    }
}
