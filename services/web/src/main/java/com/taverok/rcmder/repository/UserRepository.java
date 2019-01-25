package com.taverok.rcmder.repository;

import com.taverok.rcmder.domain.model.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> getById(long id);
}
