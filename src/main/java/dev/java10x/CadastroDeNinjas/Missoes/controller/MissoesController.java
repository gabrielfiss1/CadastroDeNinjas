package dev.java10x.CadastroDeNinjas.Missoes.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes") // mapear api
public class MissoesController {

    @GetMapping("/listar")
    public String todasMissoes(){
        return "todas missoes listadas";
    }

    @PostMapping("/criar")
    public String criarMissao(){
        return "criou missao";
    }

    @PutMapping("/alterar")
        public String alterarMissao(){
            return "alterar missao";
        }

    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "deletar missao";
    }
}
