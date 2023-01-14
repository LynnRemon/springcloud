package com.remon.order.repository;

import com.remon.order.entity.Type;

import java.util.List;

public interface TypeRepository {
    public Type findById(long id);

    public List<Type> findAll();
}
