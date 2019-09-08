package com.murong.provider.mapper;

import com.murong.provider.entity.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author murongtianyu123
 * @since 2019-09-08
 */
public interface UserMapper extends BaseMapper<User> {
//     boolean addUser(User user);
//     User findById(int id);
     List<User> findAll();
}
