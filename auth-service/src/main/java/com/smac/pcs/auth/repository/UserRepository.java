package com.smac.pcs.auth.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.smac.pcs.auth.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

}
