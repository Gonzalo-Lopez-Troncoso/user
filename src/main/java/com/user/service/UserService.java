package com.user.service;

import com.user.model.Users;
import com.user.model.UsersRequest;

import java.util.UUID;

public interface UserService {
    Object saveUser(UsersRequest user);
    Users getUser(UUID idUser);

    Users updateUser(UUID id, Users updateUser);

    boolean deleteUser(UUID id);


    boolean findEmail(String email);
}
