package com.inventorymanegement.inventorymanegement.controller;

import com.inventorymanegement.inventorymanegement.entity.Category;
import com.inventorymanegement.inventorymanegement.service.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    private CategoryService categoryService;

    @GetMapping("/message")
    private String message(){
        return "Helllo world";
    }

    @GetMapping("/getcategories")
    private List<Category> getcategory(Category category){
        return this.categoryService.getcategory((List<Category>) category);
    }

    @GetMapping("getcategories/{categoryid}")
    private Category getcategorybyId(long categoryid){
        return this.categoryService.getcategorybyId(categoryid);
    }

    @PostMapping("/addcategory")
    private Category addcategory(@RequestBody Category category){
        return this.categoryService.addcategory(category);
    }

}
