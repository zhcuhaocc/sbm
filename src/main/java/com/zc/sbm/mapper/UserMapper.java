package com.zc.sbm.mapper;

import com.zc.sbm.entity.User;

public interface UserMapper {
    User findById(Integer userId);
}
