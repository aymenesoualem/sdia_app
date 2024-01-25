package org.example.inventoryservice.web;

import org.example.inventoryservice.entities.Product;
import org.example.inventoryservice.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestController {
  public ProductRestController(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  private ProductRepository productRepository;
  @GetMapping("/products")
  public List<Product> products(){
    return productRepository.findAll();
  }

}
