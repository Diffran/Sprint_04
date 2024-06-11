package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01.S04T01N01FrancitorraFerranDiana.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HelloWorldController {

    @GetMapping("/saluda")
    public String saluda(@RequestParam(value="nom", defaultValue="Unknown") String nom){
        return "Hola, " + nom + ". Estàs executant un projecte Maven";
    }

    @GetMapping("/saluda2")
    public String saluda2(@PathVariable(value="nom", required=false)String nom){
        return "Hola, " + nom + ". Estàs executant un projecte Maven";
    }

}
