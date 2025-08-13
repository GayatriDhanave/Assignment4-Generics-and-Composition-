package com.example;

public interface Repository<T, ID> {
    public void save(T t);
    public T findById(ID id);
}
