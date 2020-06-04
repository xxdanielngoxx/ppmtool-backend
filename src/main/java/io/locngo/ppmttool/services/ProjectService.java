package io.locngo.ppmttool.services;

import io.locngo.ppmttool.domain.Project;
import io.locngo.ppmttool.repositories.ProjectRepository;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public Project upsertProject(Project project) {

        return this.projectRepository.save(project);
    }
}
