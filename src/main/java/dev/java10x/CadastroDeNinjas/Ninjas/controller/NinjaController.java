package dev.java10x.CadastroDeNinjas.Ninjas.controller;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import dev.java10x.CadastroDeNinjas.Ninjas.service.NinjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @Autowired
    private NinjaService ninjaService;

    @GetMapping("/")
    public String boasVindas(){
        return "Bem vindo!";
    }

    @PostMapping("/adicionar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja){
        return ninjaService.adicionarNinja(ninja);
    }

    @GetMapping("/listar")
    public List<NinjaModel> mostrarTodosNinjas(){
        return ninjaService.mostrarTodosNinjas();
    }

    @GetMapping("/listar/{id}")
    public Optional<NinjaModel> mostrarTodosNinjasPorId(@PathVariable Long id){
        return ninjaService.mostrarNinjaPorId(id);
    }

    @PutMapping("/alterar")
    public String alterarNinjaPorId(){
        return "Alterou ninja";
    }

    // TODO: deletar ninja

    @DeleteMapping("/deletar")
    public String deletarNinjaPorId(){ return "Deletou ninja"; }

 // TODO:    @GetMapping("/ID DO NINJA/missoes") listar todas missoes dele
 // TODO:    @GetMapping("/ID DO NINJA/missoes/codigo da missao ") listar uma missao
}
