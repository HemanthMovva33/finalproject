package com.corporate.classifieds.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.corporate.classifieds.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
