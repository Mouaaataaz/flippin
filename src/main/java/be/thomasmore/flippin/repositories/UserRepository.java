package be.thomasmore.flippin.repositories;

import be.thomasmore.flippin.model.AppUser;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository  extends CrudRepository<AppUser, Integer> {
    Optional<AppUser> findByUsername(String name);
}
