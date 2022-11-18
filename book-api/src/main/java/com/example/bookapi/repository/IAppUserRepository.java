package com.example.bookapi.repository;

import com.example.bookapi.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface IAppUserRepository extends JpaRepository<AppUser,Integer> {
    @Query(value = "select * from app_user a where a.username = :username ",nativeQuery = true)
    AppUser findAppUserByName(@Param("username") String username);
}
