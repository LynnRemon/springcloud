package com.remon.account.repository;

import com.remon.account.entity.Admin;

public interface AdminRepository {
    public Admin login(String username, String password);
}
