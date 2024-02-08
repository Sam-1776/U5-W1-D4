package samuelesimeone.esercizioD4;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import samuelesimeone.esercizioD4.entities.*;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeansConfig {

    @Bean(name = "Pomodoro")
    Aggiunte getPomodoro(){
        return new Aggiunte("Sugo", 100,0.50);
    }

    @Bean(name = "Formaggio")
    Aggiunte getFormaggio(){
        return new Aggiunte("Formaggio", 200, 0.70);
    }

    @Bean(name = "Prosciutto")
    Aggiunte getProsciutto(){
        return new Aggiunte("Prosciutto", 150, 1.00);
    }

    @Bean(name = "Panna")
    Aggiunte getPanna(){
        return new Aggiunte("Panna", 210, 1.20);
    }

    @Bean
    List<Aggiunte> getListaIngredientiMargherita(){
        ArrayList<Aggiunte> ingredienti = new ArrayList<>();
        ingredienti.add(getPomodoro());
        ingredienti.add(getFormaggio());
        return ingredienti;
    }

    @Bean
    List<Aggiunte> getIngredientiProscPanna(){
        ArrayList<Aggiunte> ingredienti = new ArrayList<>();
       ingredienti.addAll(getListaIngredientiMargherita());
        ingredienti.add(getPanna());
        ingredienti.add(getProsciutto());
        return ingredienti;
    }

    @Bean(name = "Margherita")
    Pizze getMargherita(){
    ArrayList<Aggiunte> ingredienti = new ArrayList<>();
    ingredienti.addAll(getListaIngredientiMargherita());
    long cal = 500 + ingredienti.stream().mapToLong(Alimenti::getCal).sum();
    double prezzo = 2.00 + ingredienti.stream().mapToDouble(Alimenti::getPrezzo).sum();
    return new Pizze("Margherita", cal, prezzo, ingredienti);
    }

    @Bean(name = "PannaProsciutto")
    Pizze getProsciuttoPanna(){
        ArrayList<Aggiunte> ingredienti = new ArrayList<>();
        ingredienti.addAll(getIngredientiProscPanna());
        long cal = 500 + ingredienti.stream().mapToLong(Alimenti::getCal).sum();
        double prezzo = 2.00 + ingredienti.stream().mapToDouble(Alimenti::getPrezzo).sum();
        return new Pizze("Panna e Prosciutto", cal, prezzo, ingredienti);
    }

    @Bean(name = "Cola")
    Bevande getCola(){
        return new Bevande("Coca-Cola", 150, 2.00, 0.6);
    }

    @Bean(name = "Acqua")
    Bevande getAcqua(){
        return new Bevande("Acqua", 0, 1.00, 1);
    }

}
