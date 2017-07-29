package com.basak.tracker.repository;

import org.springframework.data.repository.CrudRepository;

import com.basak.tracker.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
