package guru.springframework.recipeproject.repositories;

import guru.springframework.recipeproject.models.Building;
import org.springframework.data.repository.CrudRepository;

public interface BuildingRepository extends CrudRepository<Building, String> {

}
