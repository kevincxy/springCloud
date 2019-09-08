package com.murong.provider.service;

import com.murong.provider.entity.User;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author murongtianyu123
 * @since 2019-09-08
 */
public interface IUserService extends IService<User> {
    boolean addUser(User user);
    User findById(int id);
    List<User> findAll();
}
