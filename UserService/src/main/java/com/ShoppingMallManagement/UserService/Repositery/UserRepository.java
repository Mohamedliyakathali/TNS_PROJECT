package com.ShoppingMallManagement.UserService.Repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ShoppingMallManagement.UserService.Entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
