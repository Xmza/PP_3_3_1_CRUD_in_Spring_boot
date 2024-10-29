package org.example.pp_3_3_1_crud_in_spring_boot.service;

import org.example.pp_3_3_1_crud_in_spring_boot.model.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();
    public void saveUser(User user);
    public User getUser(Long id);
    public void deleteUser(Long id);
}
