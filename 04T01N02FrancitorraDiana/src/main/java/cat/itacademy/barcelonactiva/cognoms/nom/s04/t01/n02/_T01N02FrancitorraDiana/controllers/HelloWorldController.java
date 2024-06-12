package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n02._T01N02FrancitorraDiana.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HelloWorldController {

    @GetMapping("/saluda")
    public String saluda(@RequestParam(value="nom", defaultValue="Unknown") String nom){
        return "Hola, " + nom + ". Estàs executant un projecte Maven";
    }

    @GetMapping({"/saluda2","/saluda2/{name}"})
    public String saluda2(@PathVariable(required=false)String name){
        return "Hola, " + name + ". Estàs executant un projecte Maven";
    }
}