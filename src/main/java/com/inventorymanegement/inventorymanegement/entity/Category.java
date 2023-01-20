package com.inventorymanegement.inventorymanegement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Category {
    @Id
    private long categoryid;
    private String categoryname;
    private String image;

    public Category() {
        super();
    }

    public Category(long categoryid, String categoryname, String image) {
        super();
        this.categoryid = categoryid;
        this.categoryname = categoryname;
        this.image = image;
    }

    public long getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(long categoryid) {
        this.categoryid = categoryid;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryid=" + categoryid +
                ", categoryname='" + categoryname + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
