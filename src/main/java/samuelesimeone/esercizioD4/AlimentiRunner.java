package samuelesimeone.esercizioD4;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import samuelesimeone.esercizioD4.entities.Aggiunte;
import samuelesimeone.esercizioD4.entities.Alimenti;
import samuelesimeone.esercizioD4.entities.Bevande;
import samuelesimeone.esercizioD4.entities.Pizze;
import samuelesimeone.esercizioD4.service.AlimentiService;

@Component
public class AlimentiRunner implements CommandLineRunner {

    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EsercizioD4Application.class);
    @Autowired
    AlimentiService alimentiService;

    @Override
    public void run(String... args) throws Exception {
        Alimenti pomodoro = (Alimenti) ctx.getBean("Pomodoro");
        Alimenti formaggio = (Alimenti) ctx.getBean("Formaggio");
        Alimenti prosciutto = (Alimenti) ctx.getBean("Prosciutto");
        Alimenti panna = (Alimenti) ctx.getBean("Panna");

        Alimenti margherita = (Alimenti) ctx.getBean("Margherita");
        Alimenti pannaProsciutto = (Alimenti) ctx.getBean("PannaProsciutto");

        Alimenti cola = (Alimenti) ctx.getBean("Cola");
        Alimenti acqua = (Alimenti) ctx.getBean("Acqua");


        alimentiService.save(pomodoro);
        alimentiService.save(formaggio);
        alimentiService.save(prosciutto);
        alimentiService.save(panna);
//        alimentiService.findPizzaPriceLower(5).forEach(System.out::println);
//        alimentiService.findByName("Coca-Cola");


    }
}
