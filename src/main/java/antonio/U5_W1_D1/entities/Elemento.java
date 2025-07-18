package antonio.U5_W1_D1.entities;

import io.micrometer.observation.annotation.Observed;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;




public abstract class Elemento {
    protected String name;
    protected double prezzo;
    protected int calorie;


    public Elemento(String name, double prezzo, int calorie) {
        this.name = name;
        this.prezzo = prezzo;
        this.calorie = calorie;
    }

    public String getName() {
        return name;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getCalorie() {
        return calorie;
    }



    @Override
    public String toString() {

        return name + "- $" + prezzo + " " + calorie + "kcal";
    }


}
