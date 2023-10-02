package guru.springframework.recipeproject.repositories;


import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

public interface PasswordResets extends CrudRepository<guru.springframework.recipeproject.models.PasswordResets, Integer> {

}
