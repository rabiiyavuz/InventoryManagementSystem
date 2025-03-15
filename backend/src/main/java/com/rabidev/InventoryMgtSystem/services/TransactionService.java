package com.rabidev.InventoryMgtSystem.services;

import com.rabidev.InventoryMgtSystem.dtos.Response;
import com.rabidev.InventoryMgtSystem.dtos.TransactionRequest;
import com.rabidev.InventoryMgtSystem.enums.TransactionStatus;

public interface TransactionService {
    Response purchase(TransactionRequest transactionRequest);

    Response sell(TransactionRequest transactionRequest);

    Response returnToSupplier(TransactionRequest transactionRequest);

    Response getAllTransactions(int page, int size, String filter);

    Response getAllTransactionById(Long id);

    Response getAllTransactionByMonthAndYear(int month, int year);

    Response updateTransactionStatus(Long transactionId, TransactionStatus status);
}
