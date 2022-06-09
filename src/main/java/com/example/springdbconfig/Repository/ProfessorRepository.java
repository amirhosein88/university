package com.example.springdbconfig.Repository;

import com.example.springdbconfig.Model.Professor;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProfessorRepository extends CrudRepository<Professor , Long> {

    @Override
    default <S extends Professor> S save(S entity) {
        return null;
    }

    @Override
    default <S extends Professor> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    default Optional<Professor> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    default boolean existsById(Long aLong) {
        return false;
    }

    @Override
    default Iterable<Professor> findAll() {
        return null;
    }

    @Override
    default Iterable<Professor> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    default long count() {
        return 0;
    }

    @Override
    default void deleteById(Long aLong) {

    }

    @Override
    default void delete(Professor entity) {

    }

    @Override
    default void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    default void deleteAll(Iterable<? extends Professor> entities) {

    }

    @Override
    default void deleteAll() {

    }
}
