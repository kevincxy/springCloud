package com.murong.provider.service.impl;

import com.murong.provider.entity.User;
import com.murong.provider.mapper.UserMapper;
import com.murong.provider.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author murongtianyu123
 * @since 2019-09-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Resource
    private UserMapper userMapper;

    public boolean addUser(User user){
        int result = userMapper.insert(user);
        if(result > 0){
            return true;
        }
        return false;
    }
    public User findById(int id){
        User user = userMapper.selectById(id);
        return user;
    }
    public List<User> findAll(){
        List<User> users = userMapper.findAll();
        return users;
    }
}
