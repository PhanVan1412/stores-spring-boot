package learn.springboot.stores.controllers;

import learn.springboot.stores.models.Product;
import learn.springboot.stores.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/products")
public class ProductController {

    @Autowired
    private ProductRepository repository;
    @GetMapping("")
    List<Product> getAllProduct() {
        return repository.findAll();
    }
    // Get details product
    @GetMapping("/{id}")
    Optional<Product> findById(@PathVariable Long id) {
        return repository.findById(id);
    }
}
