package samuelesimeone.esercizioD4.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Bevande extends Alimenti{
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
