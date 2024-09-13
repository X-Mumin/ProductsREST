package com.mumin.productsrest.controller;

import com.mumin.productsrest.entity.Product;
import com.mumin.productsrest.repo.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductRestController
{
    ProductRepository productRepository;

    public ProductRestController(ProductRepository productRepository)
    {
        this.productRepository = productRepository;
    }

    @GetMapping("/products/")
    public List<Product> getProducts()
    {
        return productRepository.findAll();
    }

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable("id") Long id)
    {
        return productRepository.findById(id).get();
    }

    @PostMapping("/products/")
    public Product addProduct(@RequestBody Product product)
    {
        return productRepository.save(product);
    }

    @PutMapping ("/products/")
    public Product updateProduct(@RequestBody Product product)
    {
        return productRepository.save(product);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable("id") Long id)
    {
        productRepository.deleteById(id);
    }
}
