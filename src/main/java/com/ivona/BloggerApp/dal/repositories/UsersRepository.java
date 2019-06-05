package com.ivona.BloggerApp.dal.repositories;

import com.ivona.BloggerApp.dal.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByUsername(String username);
}