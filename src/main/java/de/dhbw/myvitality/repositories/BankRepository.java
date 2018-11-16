package de.dhbw.myvitality.repositories;

import de.dhbw.myvitality.entities.Bank;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

/***
 * CRUD Repository + eigene Query
 * @author Tamino Fischer alias CodeKeks
 */
public interface BankRepository extends CrudRepository<Bank, String> {

    /***
     * @author Tamino Fischer alias CodeKeks
     */
    @Query("select b from Bank b WHERE b.iban = :iban and b.bic = :bic")
    public Optional<Bank> findBankByQuery(@Param("iban") String iban, @Param("bic") String bic);
}
