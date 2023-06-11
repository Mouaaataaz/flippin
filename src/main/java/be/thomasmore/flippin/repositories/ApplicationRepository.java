package be.thomasmore.flippin.repositories;

import be.thomasmore.flippin.model.Application;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ApplicationRepository extends CrudRepository<Application, Integer> {

}
