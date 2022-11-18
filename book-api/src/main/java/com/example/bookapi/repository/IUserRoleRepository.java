package com.example.bookapi.repository;

import com.example.bookapi.model.AppUser;
import com.example.bookapi.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface IUserRoleRepository extends JpaRepository<UserRole,Integer> {
    List<UserRole> findAllByAppUser(AppUser appUser);
}
