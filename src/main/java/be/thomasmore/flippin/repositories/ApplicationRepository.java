package be.thomasmore.flippin.repositories;

import be.thomasmore.flippin.model.Marketplace;
import be.thomasmore.flippin.model.Application;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ApplicationRepository extends CrudRepository<Application, Integer> {

    Optional<Application> findFirstByIdLessThanOrderByIdDesc(int id);
    Optional<Application> findFirstByIdGreaterThanOrderById(int id);

    Optional<Application> findFirstByOrderByIdDesc();
    Optional<Application> findFirstByOrderByIdAsc();

    List<Application> findByMarketplace(Marketplace marketplace);
}
