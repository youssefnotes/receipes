package guru.springframework.recipeproject.controllers;

import guru.springframework.recipeproject.models.Building;
import guru.springframework.recipeproject.models.Project;
import guru.springframework.recipeproject.repositories.BuildingRepository;
import guru.springframework.recipeproject.repositories.ProjectRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuildingPostController {


    private final BuildingRepository buildingrepository;


    public BuildingPostController(BuildingRepository buildingrepository) {
        this.buildingrepository = buildingrepository;
    }


    @GetMapping("/buildings")
    Iterable<Building> all() {
        return buildingrepository.findAll();
    }


    @PostMapping("/buildings")
    Building newBuilding(@RequestBody Building newBuilding) {
        return buildingrepository.save(newBuilding);
    }
}