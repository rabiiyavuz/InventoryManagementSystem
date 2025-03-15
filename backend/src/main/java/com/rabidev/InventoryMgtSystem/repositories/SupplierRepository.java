package com.rabidev.InventoryMgtSystem.repositories;

import com.rabidev.InventoryMgtSystem.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
