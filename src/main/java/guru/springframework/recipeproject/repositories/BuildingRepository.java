package guru.springframework.recipeproject.repositories;

import guru.springframework.recipeproject.models.Building;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

public interface BuildingRepository extends CrudRepository<Building, Integer> {

}
