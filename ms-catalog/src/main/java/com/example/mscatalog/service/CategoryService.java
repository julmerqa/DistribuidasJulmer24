package com.example.mscatalog.service;

import com.example.mscatalog.entity.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    public List<Category> list();

    public Optional<Category> getById(Integer id);

    public Category save(Category category);

    public Category update(Integer id, Category category);

    public void delete(Integer id);

}
