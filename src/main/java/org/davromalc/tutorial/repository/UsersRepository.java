package org.davromalc.tutorial.repository;

import org.davromalc.tutorial.model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<Users, String> {
  Users findByUsername(String username);
}
