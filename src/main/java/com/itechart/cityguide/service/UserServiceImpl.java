package com.itechart.cityguide.service;

import com.itechart.cityguide.domain.dto.UserDto;
import com.itechart.cityguide.domain.sql.User;
import com.itechart.cityguide.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

@Service
@Log4j2
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    @Transactional
    public User create(UserDto user) {
        User dbUser = User.builder()
                .username(user.getUsername())
                .build();
        return userRepository.save(dbUser);
    }

    @Override
    @Transactional
    public User update(UserDto updateUser) {
        User oldUser = userRepository.findById(updateUser.getId()).orElse(null);
        Objects.requireNonNull(oldUser, "User not found");
        if (!oldUser.getUsername().equals(updateUser.getUsername())) {
            oldUser.setUsername(updateUser.getUsername());
        }

        return userRepository.save(oldUser);
    }

    @Override
    @Transactional(readOnly = true)
    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public User findByUsername(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
