package com.hoaxify.hoaxify.repositories;

import com.hoaxify.hoaxify.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser, Long> {
}
