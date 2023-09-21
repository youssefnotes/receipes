package guru.springframework.recipeproject.repositories;

import guru.springframework.recipeproject.models.Users;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<Users, Long> {

}
