package samuelesimeone.esercizioD4.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
public class Pizze extends Alimenti{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;

    @ManyToMany
    @JoinTable(
            name = "pizze_topping",
            joinColumns = @JoinColumn(name = "pizze_id"),
            inverseJoinColumns = @JoinColumn(name = "aggiunte_id")
    )
    private List<Aggiunte> ingredienti;

    public Pizze(String nome, long cal, double prezzo, List<Aggiunte> ingredienti) {
        super(nome, cal, prezzo);
        this.ingredienti = ingredienti;
    }

    @Override
    public String toString() {
        return "Pizze{" +
                "nome= " + getNome() +
                " ingredienti= " + ingredienti +
                " cal= " + getCal() +
                " prezzo= " + getPrezzo() +
                '}';
    }
}
