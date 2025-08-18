package com.example;

import java.util.HashMap;
import java.util.Map;

public class UserRepository implements Repository<User, Integer> {
    Map<Integer, User> users = new HashMap<>();

    @Override
    public void save(User user) {
        users.put(user.getId(), user);
        System.out.println("User saved");
    }
    @Override
    public User findById(Integer id) {
        return users.containsKey(id) ? users.get(id) : null;
    }

}
