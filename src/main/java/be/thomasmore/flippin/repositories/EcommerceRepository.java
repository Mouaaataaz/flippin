package be.thomasmore.flippin.repositories;

import be.thomasmore.flippin.model.Ecommerce;
import org.springframework.data.repository.CrudRepository;

public interface EcommerceRepository extends CrudRepository<Ecommerce, Integer> {
}
