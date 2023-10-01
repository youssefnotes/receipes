package guru.springframework.recipeproject.controllers;

import guru.springframework.recipeproject.models.Building;
import guru.springframework.recipeproject.models.Unit;
import guru.springframework.recipeproject.repositories.BuildingRepository;
import guru.springframework.recipeproject.repositories.UnitRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnitPostController {


    private final UnitRepository unitrepository;

    public UnitPostController(UnitRepository unitrepository) {
        this.unitrepository = unitrepository;
    }


    @GetMapping("/units")
    Iterable<Unit> all() {
        return unitrepository.findAll();
    }


    @PostMapping("/units")
    Unit newUnit(@RequestBody Unit newUnit) {
        return unitrepository.save(newUnit);
    }
}