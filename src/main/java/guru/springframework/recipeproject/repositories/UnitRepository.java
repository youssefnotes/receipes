package guru.springframework.recipeproject.repositories;

import guru.springframework.recipeproject.models.Unit;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

public interface UnitRepository extends CrudRepository<Unit, Integer> {

}
