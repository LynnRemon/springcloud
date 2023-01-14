package com.remon.menu.repository;

import com.remon.menu.entity.Type;

import java.util.List;

public interface TypeRepository {
    public Type findById(long id);

    public List<Type> findAll();
}
