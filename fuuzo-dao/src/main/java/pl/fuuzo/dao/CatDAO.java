package pl.fuuzo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.fuuzo.domain.Cat;

@Repository
public interface CatDAO extends CrudRepository<Cat, Long> {
    public Iterable<Cat> findAll();
    public Cat findById(Long id);
}
