package com.example.bookapi.repository;

import com.example.bookapi.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository extends JpaRepository<Book,Integer> {

    @Query(value = "select book.id,book.amount,book.author,book.code,book.img,book.name,book.price,book.publishing_company, " +
            "book.release_date ,book.size,book.status_delete ,book.total_page ,book.type from book " +
            "join type_book on book.type = type_book.id",nativeQuery = true,
    countQuery = "select count(*) from(select book.id,book.amount,book.author,book.code,book.img,book.name,book.price,book.publishing_company , " +
            "book.release_date ,book.size,book.status_delete ,book.total_page ,book.type from book " +
            "join type_book on book.type = type_book.id) temp_table")
    Page<Book> getAllBook(Pageable pageable);
}
