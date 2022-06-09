package com.example.springdbconfig.Repository;

import com.example.springdbconfig.Model.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface StudentRepository extends CrudRepository<Student , Long> {

    @Override
    default <S extends Student> S save(S entity) {
        return null;
    }

    @Override
    default <S extends Student> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    default Optional<Student> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    default boolean existsById(Long aLong) {
        return false;
    }

    @Override
    default Iterable<Student> findAll() {
        return null;
    }

    @Override
    default Iterable<Student> findAllById(Iterable<Long> longs) {
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
    default void delete(Student entity) {

    }

    @Override
    default void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    default void deleteAll(Iterable<? extends Student> entities) {

    }

    @Override
    default void deleteAll() {

    }
}
