package be.thomasmore.flippin.repositories;

import be.thomasmore.flippin.model.Industry;
import be.thomasmore.flippin.model.Marketplace;
import be.thomasmore.flippin.model.Ecommerce;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface EcommerceRepository extends CrudRepository<Ecommerce, Integer> {

    Optional<Ecommerce> findFirstByIdLessThanOrderByIdDesc(int id);
    Optional<Ecommerce> findFirstByIdGreaterThanOrderById(int id);

    Optional<Ecommerce> findFirstByOrderByIdDesc();
    Optional<Ecommerce> findFirstByOrderByIdAsc();
    List<Ecommerce> findByMarketplace(Marketplace marketplace);

    @Query("SELECT e FROM Ecommerce e " +
            "WHERE ?1 IS NULL OR LOWER(e.ecommerceName) LIKE LOWER(CONCAT('%',?1,'%'))" +
            "AND (?2 is null or e.ecommercePrice >= ?2)" +
            "AND (?3 is null or e.ecommercePrice <= ?3)" +
            "AND (?4 is null or e.ecommerceType = ?4) " +
            "ORDER BY CASE WHEN ?5 is null THEN 0 ELSE e.monthlyProfit END DESC "


    )
    List<Ecommerce> findByQuery(String keyword, Integer minimumPrice, Integer maximumPrice, String type, String profit);


}
