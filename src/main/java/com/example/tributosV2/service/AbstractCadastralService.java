package com.example.tributosV2.service;

import java.util.List;

public abstract class AbstractCadastralService<T> {

    public abstract List<T> saveAll(List<T> entitys);
    public abstract T save(T entity);
    public abstract List<T> getAll();
    public abstract T getById(Long id);

    public abstract T update(Long id,T entity);

    public abstract void delete(Long id);
}
