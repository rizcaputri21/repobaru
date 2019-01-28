public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        lingkaran o = new lingkaran();
        persegi persegi = new persegi();

        persegi.setSisi(5);
        persegi.hitungKeliling();
        System.out.println("Luas persegi Panjang Adalah = " + persegi.getKeliling());

        o.setR(7);
        o.setPi(3.14);
        o.hitungKeliling();
        System.out.println("Keliling Lingkaran adalah =" + o.getKeliling());




    }
}
