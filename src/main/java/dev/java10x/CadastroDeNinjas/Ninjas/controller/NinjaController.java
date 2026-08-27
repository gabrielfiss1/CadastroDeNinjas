package dev.java10x.CadastroDeNinjas.Ninjas.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/")
    public String boasVindas(){
        return "Bem vindo!";
    }

    @PostMapping("/adicionar")
    public String criarNinja(){
        return "Ninja cadastrado";
    }

    @GetMapping("/todos")
    public String mostrarTodosNinjas(){
        return "Mostrar todos ninja";
    }

    @GetMapping("/todos/id")
    public String mostrarTodosNinjasPorId(){
        return "Mostrar ninja por id";
    }

    @PutMapping("/alterar/id")
    public String alterarNinjaPorId(){
        return "Alterou ninja";
    }

    // TODO: deletar ninja

    @DeleteMapping("/deletar")
    public String deletarNinjaPorId(){ return "Deletou ninja"; }

 // TODO:    @GetMapping("/ID DO NINJA/missoes") listar todas missoes dele
 // TODO:    @GetMapping("/ID DO NINJA/missoes/codigo da missao ") listar uma missao
}
