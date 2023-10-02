package guru.springframework.recipeproject.repositories;

import guru.springframework.recipeproject.models.Project;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

public interface ProjectRepository extends CrudRepository<Project, Integer> {

}
