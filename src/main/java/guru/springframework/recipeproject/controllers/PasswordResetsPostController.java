package guru.springframework.recipeproject.controllers;

import guru.springframework.recipeproject.models.Unit;
import guru.springframework.recipeproject.repositories.PasswordResets;
import guru.springframework.recipeproject.repositories.UnitRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PasswordResetsPostController {


    private final PasswordResets passwordresets;

    public PasswordResetsPostController(PasswordResets passwordresets) {
        this.passwordresets = passwordresets;
    }

    @GetMapping("/passwordresets")
    Iterable<guru.springframework.recipeproject.models.PasswordResets> all() {
        return passwordresets.findAll();
    }


    @PostMapping("/passwordresets")
    guru.springframework.recipeproject.models.PasswordResets newPasswordResets(@RequestBody guru.springframework.recipeproject.models.PasswordResets
                                                                               newPasswordResets) {
        return passwordresets.save(newPasswordResets);
    }
}