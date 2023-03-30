package in.sanjeev.repository;

import org.springframework.data.repository.CrudRepository;

import in.sanjeev.entity.BookEntity;

public interface BookRepository extends CrudRepository<BookEntity, Integer> {

}
