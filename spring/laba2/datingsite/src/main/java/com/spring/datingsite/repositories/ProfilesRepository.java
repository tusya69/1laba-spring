package com.spring.datingsite.repositories;

import com.spring.datingsite.entities.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfilesRepository extends JpaRepository<Profile, Long> {
    @Query("SELECT p FROM Profile p WHERE p.phone LIKE ?1")
    Optional<Profile> findProfileByPhone(String phone);
}
