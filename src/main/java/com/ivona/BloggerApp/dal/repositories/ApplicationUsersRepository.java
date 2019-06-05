package com.ivona.BloggerApp.dal.repositories;

import com.ivona.BloggerApp.dal.models.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationUsersRepository extends JpaRepository<ApplicationUser, Long> {
    ApplicationUser findByUsername(String username);
}