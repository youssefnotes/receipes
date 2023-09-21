package guru.springframework.recipeproject.controllers;

import guru.springframework.recipeproject.models.Project;
import guru.springframework.recipeproject.repositories.ProjectRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {

    private final ProjectRepository projectRepository;

    public ProjectController(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @GetMapping("/Projects")
    public Iterable<Project> findAllProjects(){
        return this.projectRepository.findAll();
    }

    @PostMapping("/Projects")
    public Project postProject (@RequestBody Project project) {
        return this.projectRepository.save(project);
    }
}
