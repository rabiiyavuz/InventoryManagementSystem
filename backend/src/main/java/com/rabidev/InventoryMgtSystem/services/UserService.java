package com.rabidev.InventoryMgtSystem.services;

import com.rabidev.InventoryMgtSystem.dtos.LoginRequest;
import com.rabidev.InventoryMgtSystem.dtos.RegisterRequest;
import com.rabidev.InventoryMgtSystem.dtos.Response;
import com.rabidev.InventoryMgtSystem.dtos.UserDTO;
import com.rabidev.InventoryMgtSystem.models.User;

public interface UserService {

    Response registerUser(RegisterRequest registerRequest);

    Response loginUser(LoginRequest loginRequest);

    Response getAllUsers();

    User getCurrentLoggedInUser();

    Response getUserById(Long id);

    Response updateUser(Long id, UserDTO userDTO);

    Response deleteUser(Long id);

    Response getUserTransactions(Long id);
}
