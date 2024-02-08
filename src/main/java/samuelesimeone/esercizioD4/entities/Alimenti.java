package samuelesimeone.esercizioD4.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Alimenti {

    private String nome;
    private long cal;
    private double prezzo;

    protected Alimenti() {
    }

    @Override
    public String toString() {
        return "Alimenti{" +
                "nome='" + nome + '\'' +
                ", cal=" + cal +
                ", prezzo=" + prezzo +
                '}';
    }
}
