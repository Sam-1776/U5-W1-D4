package samuelesimeone.esercizioD4.exceptions;

public class ItemNotFound extends RuntimeException{
    public ItemNotFound(long id) {
        super("Il record con l'id:"+ id + " non è stato trovato");
    }
}
