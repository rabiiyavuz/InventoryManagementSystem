package com.rabidev.InventoryMgtSystem.repositories;

import com.rabidev.InventoryMgtSystem.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
