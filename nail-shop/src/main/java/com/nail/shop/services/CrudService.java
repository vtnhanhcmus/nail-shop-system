package com.nail.shop.services;

public interface CrudService<T> {
    void insert(T o);
    void update(T o);
    void delete(String id);

}
