package com.cilipica.persistence.entity;

import com.cilipica.domain.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private Integer userStatus;

    public static UserEntity fromModel(User userModel) {
        return UserEntity.builder()
                .id(userModel.getId())
                .email(userModel.getEmail())
                .firstName(userModel.getFirstName())
                .lastName(userModel.getLastName())
                .phone(userModel.getPhone())
                .username(userModel.getUsername())
                .password(userModel.getPassword())
                .userStatus(userModel.getUserStatus())
                .build();
    }

    public User toModel() {
        return User.builder()
                .id(id)
                .email(email)
                .firstName(firstName)
                .lastName(lastName)
                .phone(phone)
                .username(username)
                .userStatus(userStatus)
                .build();
    }
}
