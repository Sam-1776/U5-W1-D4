package samuelesimeone.esercizioD4.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Setter
@Getter
@Entity
@NoArgsConstructor
public class Aggiunte extends Alimenti{

    public Aggiunte(String nome, long cal, double prezzo) {
        super(nome, cal, prezzo);
    }

    public String toString() {
        return "Aggiunte{" +
                "nome= " + getNome() +
                " cal= " + getCal() +
                " prezzo= " + getPrezzo() +
                '}';
    }
}
