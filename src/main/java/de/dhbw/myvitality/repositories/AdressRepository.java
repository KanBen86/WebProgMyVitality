package de.dhbw.myvitality.repositories;

import de.dhbw.myvitality.entities.Adress;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

/***
 * CRUD Repository + eigene Query
 * @author Tamino Fischer alias CodeKeks
 */
public interface AdressRepository extends CrudRepository<Adress, String> {

    @Query("select a from Adress a Where a.street = :street and a.houseNo = :houseNo and a.zipCode = :zipCode")
    public Optional<Adress> findAdressByQuery(@Param("street") String street, @Param("houseNo") String houseNo, @Param("zipCode") String zipCode);
}
