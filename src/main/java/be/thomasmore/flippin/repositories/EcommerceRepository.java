package be.thomasmore.flippin.repositories;

import be.thomasmore.flippin.model.Marketplace;
import be.thomasmore.flippin.model.Ecommerce;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface EcommerceRepository extends CrudRepository<Ecommerce, Integer> {

    Optional<Ecommerce> findFirstByIdLessThanOrderByIdDesc(int id);
    Optional<Ecommerce> findFirstByIdGreaterThanOrderById(int id);

    Optional<Ecommerce> findFirstByOrderByIdDesc();
    Optional<Ecommerce> findFirstByOrderByIdAsc();

    List<Ecommerce> findByMarketplace(Marketplace marketplace);


}
