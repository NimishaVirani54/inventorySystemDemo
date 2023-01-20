package com.inventorymanegement.inventorymanegement.service;

import com.inventorymanegement.inventorymanegement.Repository.Repository;
import com.inventorymanegement.inventorymanegement.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;


public interface CategoryService {

        @Autowired
         List<Category> getcategory(List<Category> category);

        Category getcategorybyId(long categoryid);

        Category addcategory(Category category);


}