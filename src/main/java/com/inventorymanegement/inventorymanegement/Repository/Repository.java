package com.inventorymanegement.inventorymanegement.Repository;

import com.inventorymanegement.inventorymanegement.entity.Category;
import org.springframework.data.repository.CrudRepository;

@org.springframework.stereotype.Repository
public class Repository {
    public interface CategoryRepository extends CrudRepository<Category, Integer> {
}
}
