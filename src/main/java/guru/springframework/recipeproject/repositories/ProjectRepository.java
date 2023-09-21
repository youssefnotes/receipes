package guru.springframework.recipeproject.repositories;

import guru.springframework.recipeproject.models.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, String> {

}
