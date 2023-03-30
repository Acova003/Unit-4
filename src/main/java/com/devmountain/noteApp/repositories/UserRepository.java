package com.devmountain.noteApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devmountain.noteApp.entites.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}