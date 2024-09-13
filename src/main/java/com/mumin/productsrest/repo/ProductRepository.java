package com.mumin.productsrest.repo;

import com.mumin.productsrest.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>
{
}
