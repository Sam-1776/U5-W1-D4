package samuelesimeone.esercizioD4.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Bevande extends Alimenti{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;

    private double litri;

    public Bevande(String nome, long cal, double prezzo, double litri) {
        super(nome, cal, prezzo);
        this.litri = litri;
    }

    public String toString() {
        return "Bevande{" +
                "nome= " + getNome() +
                " litri= " + litri +
                " cal= " + getCal() +
                " prezzo= " + getPrezzo() +
                '}';
    }
}
