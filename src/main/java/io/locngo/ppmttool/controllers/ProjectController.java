package io.locngo.ppmttool.controllers;

import io.locngo.ppmttool.domain.Project;
import io.locngo.ppmttool.services.ProjectService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping
    public ResponseEntity<Project> createNewProject(@RequestBody Project project) {
        project = this.projectService.upsertProject(project);
        return new ResponseEntity<Project>(project, HttpStatus.CREATED);
    }


}
