package com.example.nailpp_3_1_2_spring_boot.repositories;


import com.example.nailpp_3_1_2_spring_boot.model.User;

import java.util.List;

public interface UserRepository {
    List<User> getListUsers();
    void removeUserById(int id);

    void saveUser(User car);

    User getUser(int id);

    void editUser(int id, User updateUser);
}
