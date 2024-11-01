package com.camoutech.product.controller;

import com.camoutech.product.model.Produit;
import com.camoutech.product.service.ProduitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/produits")
@RequiredArgsConstructor
public class ProduitController {

    private final ProduitService produitService;

    @GetMapping("/all")
    public List<Produit> getAllProduits(){
        return produitService.getAllProduits();
    }

    @PostMapping()
    public Produit CreateProduit(@RequestBody Produit produit){
        return produitService.createProduit(produit);
    }
}
