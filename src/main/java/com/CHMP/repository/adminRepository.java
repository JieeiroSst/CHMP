package com.CHMP.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import com.CHMP.DTO.admin;
import org.springframework.data.repository.query.Param;

public interface adminRepository extends JpaRepository<admin, Integer> {

    @Query("select * from admin a where a.name=:name and a.password=:password ")
    public boolean login(@Param("name")String name,@Param("password")String password);

    @java.lang.Override
    default java.util.List<T> findAll() {
        return null;
    }

    @java.lang.Override
    default java.util.List<T> findAll(Sort sort) {
        return null;
    }

    @java.lang.Override
    default Page<admin> findAll(Pageable pageable) {
        return null;
    }

    @java.lang.Override
    default java.util.List<T> findAllById(java.lang.Iterable<ID> iterable) {
        return null;
    }

    @java.lang.Override
    default long count() {
        return 0;
    }

    @java.lang.Override
    default void deleteById(Integer integer) {

    }

    @java.lang.Override
    default void delete(admin admin) {

    }

    @java.lang.Override
    default void deleteAll(java.lang.Iterable<? extends T> iterable) {

    }

    @java.lang.Override
    default void deleteAll() {

    }

    @java.lang.Override
    default <S extends admin> S save(S s) {
        return null;
    }

    @java.lang.Override
    default <S extends admin> java.util.List<S> saveAll(java.lang.Iterable<S> iterable) {
        return null;
    }

    @java.lang.Override
    default java.util.Optional<T> findById(Integer integer) {
        return java.util.Optional.empty();
    }

    @java.lang.Override
    default boolean existsById(Integer integer) {
        return false;
    }

    @java.lang.Override
    default void flush() {

    }

    @java.lang.Override
    default <S extends admin> S saveAndFlush(S s) {
        return null;
    }

    @java.lang.Override
    default void deleteInBatch(java.lang.Iterable<T> iterable) {

    }

    @java.lang.Override
    default void deleteAllInBatch() {

    }

    @java.lang.Override
    default admin getOne(Integer integer) {
        return null;
    }

    @java.lang.Override
    default <S extends admin> java.util.Optional<S> findOne(Example<S> example) {
        return java.util.Optional.empty();
    }

    @java.lang.Override
    default <S extends admin> java.util.List<S> findAll(Example<S> example) {
        return null;
    }

    @java.lang.Override
    default <S extends admin> java.util.List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @java.lang.Override
    default <S extends admin> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @java.lang.Override
    default <S extends admin> long count(Example<S> example) {
        return 0;
    }

    @java.lang.Override
    default <S extends admin> boolean exists(Example<S> example) {
        return false;
    }
}
