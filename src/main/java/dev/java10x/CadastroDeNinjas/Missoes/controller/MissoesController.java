package dev.java10x.CadastroDeNinjas.Missoes.controller;

import dev.java10x.CadastroDeNinjas.Missoes.MissaoModel;
import dev.java10x.CadastroDeNinjas.Missoes.service.MissaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

@RestController
@RequestMapping("missoes") // mapear api
public class MissoesController {

    @Autowired
    private MissaoService service;

    @GetMapping("/listar")
    public List<MissaoModel> todasMissoes(){
        return service.listarTodasMissoes();
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
