package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.S04T02N03FrancitorraDiana.model.services;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.S04T02N03FrancitorraDiana.model.domain.Fruit;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.S04T02N03FrancitorraDiana.model.repository.IFruitRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitService {

    private IFruitRepository fruitRepository;

    @Autowired
    public FruitService(IFruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    public Fruit createFruit(Fruit fruit){
        if(fruitRepository.findByName(fruit.getName()).isPresent()||fruitRepository.findById(fruit.getId()).isPresent()){
            throw new IllegalArgumentException("Create new Fruit Failed: Invalid fruit name: "+ fruit.getName()+
                    " or ID: "+fruit.getId()+" -> ALREADY EXISTS in DataBase");
        }

        return fruitRepository.save(fruit);
    }

    public Fruit updateFruit(Fruit fruit){
        if(!fruitRepository.findById(fruit.getId()).isPresent()){
            throw new EntityNotFoundException("Update Fruit Failed: Invalid fruit id: "+ fruit.getId()+
                    " -> DOESN'T EXIST in DataBase");
        }

        return fruitRepository.save(fruit);
    }

    public void  deleteFruit(long fruitId){
        if(!fruitRepository.findById(fruitId).isPresent()){
            throw new EntityNotFoundException("Delete Fruit Failed: Invalid fruit id: "+ fruitId+
                    " -> DOESN'T EXIST in DataBase");
        }

        fruitRepository.deleteById(fruitId);
    }

    public Fruit getOneFruit(long fruitId){
        return fruitRepository.findById(fruitId)
                .orElseThrow(() -> new EntityNotFoundException("Get One Fruit Failed: Invalid fruit id: "+ fruitId+
                        " -> DOESN'T EXIST in DataBase"));
    }

    public List<Fruit> getAllFruits(){
        return fruitRepository.findAll();
    }

}
