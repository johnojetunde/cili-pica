package com.cilipica.domain.service;

import com.cilipica.domain.exception.CiliPicaServiceException;
import com.cilipica.domain.model.User;

public interface UserService {
    User createUser(User body) throws CiliPicaServiceException;

    void deleteUser(String username) throws CiliPicaServiceException;

    User getUserByName(String username) throws CiliPicaServiceException;

    String loginUser(String username, String password) throws CiliPicaServiceException;

    User updateUser(User body, String username) throws CiliPicaServiceException;
}
