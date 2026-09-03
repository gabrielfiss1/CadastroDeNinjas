package dev.java10x.CadastroDeNinjas.Missoes.controller;

import dev.java10x.CadastroDeNinjas.Missoes.MissaoModel;
import dev.java10x.CadastroDeNinjas.Missoes.service.MissaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public MissaoModel criarMissao(@RequestBody MissaoModel missao) {
        return service.criarMissao(missao);
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
