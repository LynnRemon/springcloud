package com.remon.account.repository;

import com.remon.account.entity.User;

public interface UserRepository {
    public User login(String username, String password);
}
