package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.S04T02N02FrancitorraDiana.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.S04T02N02FrancitorraDiana.model.domain.Fruit;
import java.util.Optional;

@Repository
public interface IFruitRepository extends JpaRepository<Fruit, Long> {
    Optional<Fruit> findByName(String name);
}
