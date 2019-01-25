package com.taverok.rcmder.repository;

import com.taverok.rcmder.domain.model.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserRepositoryImpl implements UserRepository {
    @Override
    public Optional<User> getById(long id) {
        return Optional.empty();
    }
}
