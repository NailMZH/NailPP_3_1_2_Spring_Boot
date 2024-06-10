package com.example.nailpp_3_1_2_spring_boot.service;


import com.example.nailpp_3_1_2_spring_boot.model.User;

import java.util.List;

public interface UserService {

    List<User> getAll();
    void removeUserById(int id);


    void saveUser(User user);
    User getUser(int id);
    void editUser(int id, User updateUser);

}
