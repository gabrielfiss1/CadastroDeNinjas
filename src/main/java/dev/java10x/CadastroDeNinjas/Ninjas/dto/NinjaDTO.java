package dev.java10x.CadastroDeNinjas.Ninjas.dto;

import dev.java10x.CadastroDeNinjas.Missoes.MissaoModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NinjaDTO { // dto - tudo do model porém sem acesso a base

    private Long id;
    private String nome;
    private String email;
    private int idade;
    private MissaoModel missoes;
    private String rank;

}
