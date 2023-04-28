package com.user.repository;

import com.user.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface UserRepository extends JpaRepository<Users, UUID> {


    /**
     * Recupera correo existente
     * @param vEmail
     * @return
     */
    @Query("SELECT u FROM Users u WHERE u.email = :vEmail")
    Users findByEmail(@Param("vEmail") String vEmail);


}
