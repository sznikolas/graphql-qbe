package com.nikolas.graphql_qbe.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.graphql.data.GraphQlRepository;
import org.springframework.stereotype.Repository;

@GraphQlRepository
public interface BookRepository extends JpaRepository<Book, Long>, QueryByExampleExecutor<Book> {

}
