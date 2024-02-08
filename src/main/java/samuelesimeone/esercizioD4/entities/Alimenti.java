package samuelesimeone.esercizioD4.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Alimenti {
    @Id
    @GeneratedValue
    private long id;
    private String nome;
    private long cal;
    private double prezzo;

    protected Alimenti() {
    }

    public Alimenti(String nome, long cal, double prezzo) {
        this.nome = nome;
        this.cal = cal;
        this.prezzo = prezzo;
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
