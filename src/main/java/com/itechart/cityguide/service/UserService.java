package com.itechart.cityguide.service;

import com.itechart.cityguide.domain.dto.UserDto;
import com.itechart.cityguide.domain.sql.User;

public interface UserService {
    User create(UserDto user);

    User update(UserDto user);

    User findById(Long id);

    User findByUsername(Long id);

    void delete(Long id);
}
