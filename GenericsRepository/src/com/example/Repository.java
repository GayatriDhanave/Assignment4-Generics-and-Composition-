package com.example;

public interface Repository<T, ID> {
    public void save(T t);
    public T findById(ID id);
    default void update(ID id){
        System.out.println("ID: "+id+" updated sucessfully");
    }

    default void update (Long aLong, int price){
        System.out.println("Cannot update ID:");
    }
}
