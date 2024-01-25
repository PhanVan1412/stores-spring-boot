package learn.springboot.stores.database;

import learn.springboot.stores.models.Product;
import learn.springboot.stores.repositories.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // chứa các bean method
public class Database {
    private static final Logger logger = LoggerFactory.getLogger(Database.class);
    @Bean // Chạy ngay sau khi app được chạy
    CommandLineRunner initDatabase(ProductRepository productRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String ...args) throws Exception {
                Product productA = new Product("Apple Watch 15 Series 2024", 2024, 1200.0, "");
                Product productB = new Product("Samsung Galaxy S24 Ultra", 2024, 1500.0, "");
                logger.info("Insert data: " + productRepository.save(productA));
                logger.info("Insert data: " + productRepository.save(productB));
            }
        };
    }
}
