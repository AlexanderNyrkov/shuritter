package io.shuritter.spring.service;

import io.shuritter.spring.model.User;

public interface UserService extends BaseService<User>{
    void update(User user, String id);
}