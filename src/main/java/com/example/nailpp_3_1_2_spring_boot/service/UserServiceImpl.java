package com.example.nailpp_3_1_2_spring_boot.service;

import com.example.nailpp_3_1_2_spring_boot.model.User;
import com.example.nailpp_3_1_2_spring_boot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public List<User> getAll() {
        return userRepository.getListUsers();
    }

    @Override
    @Transactional
    public void removeUserById(int id) { userRepository.removeUserById(id); }

    @Override
    @Transactional
    public void saveUser(User user) {
        userRepository.saveUser(user);
    }


    @Override
    @Transactional
    public User getUser(int id) {
        return userRepository.getUser(id);
    }

    @Override
    @Transactional
    public void editUser(int id, User updateUser) {
        userRepository.editUser(id, updateUser);
    }


}

