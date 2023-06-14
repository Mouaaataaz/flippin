package be.thomasmore.flippin.repositories;


import be.thomasmore.flippin.model.Industry;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IndustryRepository extends CrudRepository<Industry, Integer> {
    Optional<Industry> findFirstByIdLessThanOrderByIdDesc(int id);
    Optional<Industry> findFirstByIdGreaterThanOrderById(int id);

    Optional<Industry> findFirstByOrderByIdDesc();
    Optional<Industry> findFirstByOrderByIdAsc();

}
