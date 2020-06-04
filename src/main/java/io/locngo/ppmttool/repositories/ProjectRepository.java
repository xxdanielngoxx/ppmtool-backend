package io.locngo.ppmttool.repositories;

import io.locngo.ppmttool.domain.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, Long> {
}
