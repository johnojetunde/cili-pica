package com.cilipica.persistence.repository;

import com.cilipica.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    void deleteUserByUsername(String username);

    Optional<UserEntity> findByUsername(String username);
}
