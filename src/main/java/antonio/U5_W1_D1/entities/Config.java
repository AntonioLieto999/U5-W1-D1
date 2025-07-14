package antonio.U5_W1_D1.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.List;

@Configuration
public class Config {

    @Bean
    @Primary
    public Topping prosciutto() {
        return new Topping("prosciutto",0.60,80);
    }

    @Bean
    public Topping ananas() {
        return new Topping("Ananas", 0.80, 40);
    }

    @Bean
    public Topping salame() {
        return new Topping("Salame", 0.70, 60);
    }

    @Bean
    public Topping Funghi() {
        return new Topping("Funghi", 1.20, 35);
    }

    @Bean
    @Primary
    public Pizza margherita() {
        return new Pizza("Margherita", 7.0, 800);
    }

    @Bean
    public Pizza HawaiianPizza(Pizza margherita, Topping prosciutto,Topping ananas) {
        Pizza p = new Pizza("Hawaiian", margherita.getPrezzo(), margherita.getCalorie());
        p.addTopping(prosciutto);
        p.addTopping(ananas);
        return p;
    }

    @Bean
    public Pizza diavola(Pizza margherita, Topping salame) {
        Pizza p = new Pizza("Diavola", margherita.getPrezzo(), margherita.getCalorie());
        p.addTopping(salame);
        return p;
    }

    @Bean
    public Pizza pizzaFunghi(Pizza margherita, Topping funghi) {
        Pizza p = new Pizza("Funghi", margherita.getPrezzo(), margherita.getCalorie());
        p.addTopping(funghi);
        return p;
    }

    @Bean
    public Bevanda fanta(){
        return new Bevanda("Fanta",2.0, 150);
    }

    @Bean
    public Bevanda acqua(){
        return new Bevanda("Acqua", 1.0, 0);
    }

    @Bean
    public Bevanda coca(){
        return new Bevanda("Coca cola", 2.0, 150);
    }

    @Bean
    public Bevanda birra(){
        return new Bevanda("Birra", 3.50, 250);
    }



    @Bean
    public Menu menu(Pizza margherita, Pizza HawaiianPizza, Pizza diavola, Pizza pizzaFunghi,
                     Bevanda fanta,Bevanda acqua, Bevanda coca, Bevanda birra){
        return new Menu(List.of(margherita, HawaiianPizza, diavola, pizzaFunghi), List.of(fanta, acqua, coca , birra));
    }
}
