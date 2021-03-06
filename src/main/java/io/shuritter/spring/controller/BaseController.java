package io.shuritter.spring.controller;

import io.shuritter.spring.model.BaseEntity;
import io.shuritter.spring.model.response.Response;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Interface with basic controller methods
 * @param <T> the type of entities
 * @author Alexander Nyrkov
 */
public interface BaseController<T extends BaseEntity> {
    ResponseEntity<Response> getAll(HttpServletRequest request);
}
