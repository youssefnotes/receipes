package guru.springframework.recipeproject.controllers;

import guru.springframework.recipeproject.models.Project;
import guru.springframework.recipeproject.repositories.ProjectRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectPostController {


    private final ProjectRepository projectrepository;


    public ProjectPostController(ProjectRepository projectrepository) {
        this.projectrepository = projectrepository;
    }


    @GetMapping("/projects")
    Iterable<Project> all() {
        return projectrepository.findAll();
    }


    @PostMapping("/projects")
    Project newProject(@RequestBody Project newProject) {
        return projectrepository.save(newProject);
    }
}