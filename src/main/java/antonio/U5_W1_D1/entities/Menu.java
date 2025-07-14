package antonio.U5_W1_D1.entities;

import java.util.List;

public class Menu {
    private List<Pizza> pizze;
    private List<Bevanda> bevande;

    public Menu(List<Pizza> pizze, List<Bevanda> bevande) {
        this.pizze = pizze;
        this.bevande = bevande;
    }

    public void stampaMenu() {
        System.out.println("** MENU PIZZERIA **");
        System.out.println("** PIZZE **");
        for (Pizza p : pizze) {
            System.out.println(p);
        }

        System.out.println("** BEVANDE **");
        for (Bevanda b : bevande) {
            System.out.println(b);
        }
    }
}
