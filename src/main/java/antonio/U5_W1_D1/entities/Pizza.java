package antonio.U5_W1_D1.entities;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends Elemento {
    private List<Topping> toppings = new ArrayList<>();

    public Pizza(String nome, double prezzo, int calorie) {
        super(nome, prezzo, calorie);
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public double getPrezzo() {
        double totale = super.getPrezzo();
        for (Topping t : toppings) {
            totale += t.getPrezzo();
        }
        return totale;
    }

    public int getCalorie() {
        int tot = super.getCalorie();
        for (Topping t : toppings) {
            tot += t.getCalorie();
        }
        return tot;
    }

    public String getDescrizione() {
        String name = super.getName();
        if (!toppings.isEmpty()) {
            name += " con ";
            for (int i = 0; i < toppings.size(); i++) {
                name += toppings.get(i).getName();
                if (i < toppings.size() - 1) {
                    name += ", ";
                }
            }
        }
        return name;
    }

    @Override
    public String toString() {
        return getDescrizione() + " - €" + getPrezzo() + " - " + getCalorie() + " kcal";
    }
}
