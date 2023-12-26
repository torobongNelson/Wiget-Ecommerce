package com.wiget.Wiget.Repositories;

import com.wiget.Wiget.Models.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Users,  String> {
}
