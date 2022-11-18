package com.example.bookapi.repository;

import com.example.bookapi.model.BookBill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookBillRepository extends JpaRepository<BookBill,Integer> {
}
