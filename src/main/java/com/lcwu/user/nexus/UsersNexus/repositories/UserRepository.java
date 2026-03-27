package com.lcwu.user.nexus.UsersNexus.repositories;

import com.lcwu.user.nexus.UsersNexus.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,String> {



}
