package com.user.dao;

import com.user.model.User;

public interface UserDAO {
   public void create(User user);

   public User read(int id);
}
