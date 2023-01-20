package com.inventorymanegement.inventorymanegement.service;

import com.inventorymanegement.inventorymanegement.entity.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{


    List<Category> list;
    public CategoryServiceImpl(){
        list = new ArrayList<>();
        list.add(new Category(1,"cloths","C://Users//Nimi//Videos//download (1).jpg"));
        list.add(new Category(2,"shoe","C://Users//Nimi//Videos//download.jpg"));

    }
    @Override
    public List<Category> getcategory(List<Category> category) {
        return list;

    }
    @Override
    public Category getcategorybyId(long categoryid) {
        Category c=null;
        for(Category category1:list){
            if (category1.getCategoryid() == categoryid){
                c= category1;
                break;
            }
        }
        return c;
    }

    @Override
    public Category addcategory(Category category) {
        list.add(category);
        return category;
    }


}
