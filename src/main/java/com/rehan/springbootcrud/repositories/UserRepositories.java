package com.rehan.springbootcrud.repositories;

import com.rehan.springbootcrud.models.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface UserRepositories extends JpaRepository<User, Long> {

    
}