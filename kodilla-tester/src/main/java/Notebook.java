public class Notebook {
    int weight;
    int price;
    int year; // Nowe pole: rok produkcji

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }
    public void checkWeight() {
        if (this.weight < 1200) {
            System.out.println("This notebook is light.");
        } else if (this.weight >= 1200 && this.weight <= 2000) {
            System.out.println("This notebook is not too heavy.");
        } else {
            System.out.println("This notebook is very heavy.");
        }
    }
    public void checkYearAndPrice() {
        if (this.year > 2020 && this.price > 2000) {
            System.out.println("This is a modern, high-end machine.");
        } else if (this.year < 2015 && this.price < 1000) {
            System.out.println("This is an older, budget-friendly notebook.");
        } else if (this.year > 2018 && this.price <= 1500) {
            System.out.println("This is a relatively new notebook with a great price-to-performance ratio.");
        } else {
            System.out.println("This is a standard notebook.");
        }
    }
}