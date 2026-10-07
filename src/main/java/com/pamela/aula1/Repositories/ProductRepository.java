package com.pamela.aula1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pamela.aula1.Model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
