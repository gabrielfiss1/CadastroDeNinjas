package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Missoes.domain.DificuldadeMissao;
import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Table(name = "tb_missoes")
@Data // cria getters e setters
@NoArgsConstructor
@AllArgsConstructor
public class MissaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "dificuldade_missao")
    private DificuldadeMissao dificuldade;

    @OneToMany(mappedBy = "missoes") // uma missao tem varios ninjas
    private List<NinjaModel> ninjas;

    // TODO: private NinjaModel anunciadaPeloNinja;
    // TODO: private int recompensa;
}
