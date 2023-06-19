public class Main {
    public static void main(String[] args)
    {
        Product p1 = new Product("Coca Cola", "110281", 4, 0.2);
        System.out.println(p1.getInfo());
        System.out.println("Pretul final al Coca Cola este: " +p1.PretFinal(4));

        Chocolate c1 = new Chocolate("Milka", "114235", 8, 0.2, 200);
        System.out.println(c1.getInfoChocolate());
        System.out.println("Pretul final al ciocolatii este: " +c1.PretFinal(8));

        Wine w1 = new Wine("Zarea", "1344321", 15.3, 0.2, 500);
        System.out.println(w1.getInfoWine());
        System.out.println("Pretul final al vinului este: " +w1.PretFinalVin(15.3));
    }
}