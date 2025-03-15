package com.rabidev.InventoryMgtSystem.services;

import com.rabidev.InventoryMgtSystem.dtos.Response;
import com.rabidev.InventoryMgtSystem.dtos.SupplierDTO;

public interface SupplierService {

    Response addSupplier(SupplierDTO supplierDTO);

    Response updateSupplier(Long id, SupplierDTO supplierDTO);

    Response getAllSupplier();

    Response getSupplierById(Long id);

    Response deleteSupplier(Long id);

}
