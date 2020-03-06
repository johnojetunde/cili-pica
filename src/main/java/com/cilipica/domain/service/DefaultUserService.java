package com.cilipica.domain.service;

import com.cilipica.domain.exception.CiliPicaServiceException;
import com.cilipica.domain.model.User;
import com.cilipica.persistence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.cilipica.persistence.entity.UserEntity.fromModel;

@Service
public class DefaultUserService implements UserService {
    private UserRepository userRepository;

    @Autowired
    public DefaultUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User body) throws CiliPicaServiceException {
        try {
            return userRepository.save(fromModel(body)).toModel();
        } catch (Exception e) {
            throw new CiliPicaServiceException("Unable to create user", e);
        }
    }

    @Override
    public void deleteUser(String username) throws CiliPicaServiceException {
        try {
            userRepository.deleteUserByUsername(username);
        } catch (Exception e) {
            throw new CiliPicaServiceException("Error deleting user", e);
        }
    }

    @Override
    public User getUserByName(String username) throws CiliPicaServiceException {
        var result = userRepository.findByUsername(username);
        if (result.isPresent()) {
            return result.get().toModel();
        }
        throw new CiliPicaServiceException("Unable to find user by the username");
    }

    @Override
    public String loginUser(String username, String password) {
        return null;
    }

    @Override
    public User updateUser(User body, String username) throws CiliPicaServiceException {
        try {
            var user = getUserByName(username);
            body.setId(user.getId());
            return userRepository.save(fromModel(body)).toModel();
        } catch (Exception e) {
            throw new CiliPicaServiceException("Unable to update user", e);
        }
    }
}
