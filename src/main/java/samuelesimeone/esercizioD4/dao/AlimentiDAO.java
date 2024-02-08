package samuelesimeone.esercizioD4.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import samuelesimeone.esercizioD4.entities.Alimenti;

@Repository
public interface AlimentiDAO extends JpaRepository<Alimenti, Long> {
}
