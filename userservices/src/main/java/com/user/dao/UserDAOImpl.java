package com.user.dao;

import java.util.HashMap;
import java.util.Map;

import com.user.model.User;

public class UserDAOImpl implements UserDAO {
   Map<Integer, User> users = new HashMap<>();

   @Override
   public void create(User user) {
      users.put(user.getId(), user);
   }

   @Override
   public User read(int id) {
      return users.get(id);
   }
}
