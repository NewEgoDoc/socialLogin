package com.security.login.sociallogin.domain.repository;

import com.security.login.sociallogin.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    public User findByUserid(String username);
}
