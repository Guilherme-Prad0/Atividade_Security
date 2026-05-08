package com.zera.produto.controllers;

import com.zera.produto.models.ProdutoModel;
import com.zera.produto.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<ProdutoModel> findAll(){
        return produtoService.buscarTodosProdutos();
    }

    @PostMapping
    public ProdutoModel criarProduto(@RequestBody ProdutoModel produtoModel){
        return produtoService.criarProduto(produtoModel);
    }

}
