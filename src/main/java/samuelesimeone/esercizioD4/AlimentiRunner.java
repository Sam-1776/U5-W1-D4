package samuelesimeone.esercizioD4;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import samuelesimeone.esercizioD4.entities.Aggiunte;
import samuelesimeone.esercizioD4.entities.Bevande;
import samuelesimeone.esercizioD4.entities.Pizze;
import samuelesimeone.esercizioD4.service.AlimentiService;

import java.util.ArrayList;
import java.util.List;

@Component
public class AlimentiRunner implements CommandLineRunner {

    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EsercizioD4Application.class);
    @Autowired
    AlimentiService alimentiService;

    @Override
    public void run(String... args) throws Exception {
        Aggiunte pomodoro = (Aggiunte) ctx.getBean("Pomodoro");
        Aggiunte formaggio = (Aggiunte) ctx.getBean("Formaggio");
        Aggiunte prosciutto = (Aggiunte) ctx.getBean("Prosciutto");
        Aggiunte panna = (Aggiunte) ctx.getBean("Panna");

        Pizze margherita = (Pizze) ctx.getBean("Margherita");
        Pizze pannaProsciutto = (Pizze) ctx.getBean("PannaProsciutto");

        Bevande cola = (Bevande) ctx.getBean("Cola");
        Bevande acqua = (Bevande) ctx.getBean("Acqua");


        alimentiService.findPizzaPriceLower(5).forEach(System.out::println);
        alimentiService.findByName("Coca-Cola");


    }
}
