package de.dhbw.myvitality.repositories;

import de.dhbw.myvitality.entities.Storrage;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface StorrageRepository extends CrudRepository<Storrage, String> {

    /**
     * Diese Methode sucht alle einträge in der Tabelle Storrage
     * @author Benjamin Kanzler
     */
    @Query("SELECT s FROM Storrage s")
    public Iterable<Storrage> findAll();
}
