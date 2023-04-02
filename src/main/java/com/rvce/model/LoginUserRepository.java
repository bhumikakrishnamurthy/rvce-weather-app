package com.rvce.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginUserRepository extends JpaRepository<LoginUser, Long> {
    LoginUser findByEmailAndPassword(String email, String password);

    LoginUser findByUsernameAndPassword(String username, String password);
}
