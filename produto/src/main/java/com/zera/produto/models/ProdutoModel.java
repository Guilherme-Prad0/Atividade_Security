package com.zera.produto.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "TBL_Produto")
@Data
public class ProdutoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
}
