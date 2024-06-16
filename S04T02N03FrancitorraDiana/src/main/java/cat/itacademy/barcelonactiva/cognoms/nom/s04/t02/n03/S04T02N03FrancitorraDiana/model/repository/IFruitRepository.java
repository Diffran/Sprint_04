package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.S04T02N03FrancitorraDiana.model.repository;



import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.S04T02N03FrancitorraDiana.model.domain.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface IFruitRepository extends JpaRepository<Fruit, Long> {
    Optional<Fruit> findByName(String name);
}
