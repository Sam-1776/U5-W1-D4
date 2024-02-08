package samuelesimeone.esercizioD4.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import samuelesimeone.esercizioD4.dao.AlimentiDAO;
import samuelesimeone.esercizioD4.entities.Alimenti;
import samuelesimeone.esercizioD4.exceptions.ItemNotFound;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class AlimentiService {
    @Autowired
    private AlimentiDAO alimentiDAO;

    public void save(Alimenti alimenti){
        alimentiDAO.save(alimenti);
        log.info("Utente Salvato");
    }

    public Alimenti findById(long id) throws ItemNotFound {
        // Torna un Optional
        Optional<Alimenti> found = alimentiDAO.findById(id);
        if (found.isPresent()) {
            // per convertire i tipi si usa il get
            return found.get();
        }else {
            throw new ItemNotFound(id);
        }
    }

    public List<Alimenti> findAll(){
        return  alimentiDAO.findAll();
    }


    public void deleteUser(long id){
        Alimenti found = this.findById(id);
        alimentiDAO.delete(found);
    }


}
