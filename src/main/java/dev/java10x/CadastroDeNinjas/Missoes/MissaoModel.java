package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Missoes.domain.DificuldadeMissao;
import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "tb_missoes")
public class MissaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private DificuldadeMissao dificuldade;

    @OneToMany(mappedBy = "missoes") // uma missao tem varios ninjas
    private List<NinjaModel> ninjas;

    // TODO: private NinjaModel anunciadaPeloNinja;
    // TODO: private int recompensa;

    public MissaoModel(Long id, String nomeMissao, DificuldadeMissao dificuldade, NinjaModel ninjas) {
        this.id = id;
        this.nome = nomeMissao;
        this.dificuldade = dificuldade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public DificuldadeMissao getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(DificuldadeMissao dificuldade) {
        this.dificuldade = dificuldade;
    }

}
