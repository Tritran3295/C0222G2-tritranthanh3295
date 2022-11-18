package com.example.bookapi.repository;

import com.example.bookapi.model.TypeBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITypeBookRepository extends JpaRepository<TypeBook,Integer> {
}
