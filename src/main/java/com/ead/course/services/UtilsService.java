package com.ead.course.services;

import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface UtilsService {

    // Método para criar a URL para obter todos os usuários de um curso específico com paginação
    String createUrlGetAllUsersByCourse(UUID courseId, Pageable pageable);
}
