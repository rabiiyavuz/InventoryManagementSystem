package com.rabidev.InventoryMgtSystem.services;

import com.rabidev.InventoryMgtSystem.dtos.CategoryDTO;
import com.rabidev.InventoryMgtSystem.dtos.Response;

public interface CategoryService {

    Response createCategory(CategoryDTO categoryDTO);

    Response getAllCategories();

    Response getCategoryById(Long id);

    Response updateCategory(Long id, CategoryDTO categoryDTO);

    Response deleteCategory(Long id);
}
