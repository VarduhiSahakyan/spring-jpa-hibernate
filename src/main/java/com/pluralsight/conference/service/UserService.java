package com.pluralsight.conference.service;

import com.pluralsight.conference.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserService extends JpaRepository<User, Long> {

}
