package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.S04T02N03FrancitorraDiana.model.repository;



import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.S04T02N03FrancitorraDiana.model.domain.Fruit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface IFruitRepository extends MongoRepository<Fruit, String> {
    Optional<Fruit> findByName(String name);
}
