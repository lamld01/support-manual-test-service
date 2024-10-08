package com.lamld.supportmanualtest.app.dto.project;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

/**
 * DTO for {@link com.lamld.supportmanualtest.server.entities.Project}
 */
public record ProjectDto(Integer parentProjectId, Integer rootProjectId,
                         @Size(max = 255) String projectName, @Size(max = 1000) String description,
                         @Size(max = 255) String apiBaseUrl,
                         @Size(max = 1000) String token) {
}