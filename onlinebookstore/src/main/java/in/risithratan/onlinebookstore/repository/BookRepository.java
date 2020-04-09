package in.risithratan.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.risithratan.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
