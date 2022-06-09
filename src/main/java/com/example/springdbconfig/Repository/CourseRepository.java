package com.example.springdbconfig.Repository;

import com.example.springdbconfig.Model.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CourseRepository extends CrudRepository<Course , Long> {

    @Override
    default <S extends Course> S save(S entity) {
        return null;
    }

    @Override
    default <S extends Course> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    default Optional<Course> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    default boolean existsById(Long aLong) {
        return false;
    }

    @Override
    default Iterable<Course> findAll() {
        return null;
    }

    @Override
    default Iterable<Course> findAllById(Iterable<Long> longs) {
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
    default void delete(Course entity) {

    }

    @Override
    default void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    default void deleteAll(Iterable<? extends Course> entities) {

    }

    @Override
    default void deleteAll() {

    }
}
