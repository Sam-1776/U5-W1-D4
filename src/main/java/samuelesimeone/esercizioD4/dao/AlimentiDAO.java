package samuelesimeone.esercizioD4.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import samuelesimeone.esercizioD4.entities.Alimenti;

import java.util.List;


@Repository
public interface AlimentiDAO extends JpaRepository<Alimenti, Long> {
    @Query("SELECT p FROM Pizze p WHERE p.prezzo <= price")
    List<Alimenti> findPizzaPriceLower(int price);

    @Query("SELECT b FROM Bevande b WHERE b.nome = name")
    List<Alimenti> findBevandaFromName(String name);
}
