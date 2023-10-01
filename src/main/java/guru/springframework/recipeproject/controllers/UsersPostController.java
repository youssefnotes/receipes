package guru.springframework.recipeproject.controllers;

import guru.springframework.recipeproject.models.Unit;
import guru.springframework.recipeproject.models.Users;
import guru.springframework.recipeproject.repositories.UnitRepository;
import guru.springframework.recipeproject.repositories.UsersRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersPostController {


    private final UsersRepository usersrepository;

    public UsersPostController(UsersRepository usersrepository) {
        this.usersrepository = usersrepository;
    }

    @GetMapping("/users")
    Iterable<Users> all() {
        return usersrepository.findAll();
    }


    @PostMapping("/users")
    Users newUser(@RequestBody Users newUser) {
        return usersrepository.save(newUser);
    }
}