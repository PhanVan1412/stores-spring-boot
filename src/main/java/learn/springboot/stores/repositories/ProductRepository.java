package learn.springboot.stores.repositories;

import learn.springboot.stores.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
