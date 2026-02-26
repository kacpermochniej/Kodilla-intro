public class FirstClass {
    public static void main(String[] args) {
        Notebook macbook = new Notebook(1100, 2500, 2024);
        Notebook oldie = new Notebook(2500, 500, 2012);
        Notebook acer = new Notebook(1800, 900, 2019);
        Notebook lenovo = new Notebook(2200, 1500, 2021);

        System.out.println("--- MacBook ---");
        macbook.checkPrice();
        macbook.checkWeight();
        macbook.checkYearAndPrice();

        System.out.println("\n--- Oldie Laptop ---");
        oldie.checkPrice();
        oldie.checkWeight();
        oldie.checkYearAndPrice();

        System.out.println("\n--- Acer ---");
        acer.checkPrice();
        acer.checkWeight();
        acer.checkYearAndPrice();

        System.out.println("\n--- Lenovo ---");
        lenovo.checkPrice();
        lenovo.checkWeight();
        lenovo.checkYearAndPrice();
    }
}