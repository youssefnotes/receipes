package guru.springframework.recipeproject.repositories;

import guru.springframework.recipeproject.models.Users;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

public interface UsersRepository extends CrudRepository<Users, Integer> {

}
