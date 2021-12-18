
package com.Reto4ciclo4.reto4.repository.Crudrepository;

import com.Reto4ciclo4.reto4.model.Laptop;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author lei20
 */
public interface LaptopCrudRepository  extends MongoRepository<Laptop, Integer> {
    
public List<Laptop> findByPrice(double price);
    public List<Laptop> findByDescriptionContainingIgnoreCase(String description);
}